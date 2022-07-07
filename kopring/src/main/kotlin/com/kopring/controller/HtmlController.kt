package com.kopring.controller

import com.kopring.Member
import com.kopring.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import java.security.MessageDigest
import javax.servlet.http.HttpSession

@Controller
class HtmlController {

    @Autowired
    lateinit var repository:MemberRepository

    @GetMapping("/")
    fun index(model : Model):String{
        model.addAttribute("title", "Home")
        return "index"
    }

    fun crypto(ss:String):String{
        val sha=MessageDigest.getInstance("SHA-256")
        val hexa=sha.digest(ss.toByteArray())
        return hexa.fold("", {str, it -> str + "%02x".format(it)})
    }

    @GetMapping("/{formType}")
    fun signForm(model : Model, @PathVariable formType:String):String{
        var response:String = ""
        if(formType.equals("sign")){
            response="sign"
        }else if(formType.equals("login")){
            response="login"
        }

        model.addAttribute("title", response)

        return response
    }

    @PostMapping("/sign")
    fun postSign(model:Model,
                 @RequestParam(value="id")id:String,
                 @RequestParam(value="password")pw:String,
                 @RequestParam(value="name")name:String,
                 @RequestParam(value="sex")sex:String) : String{
        try {
            //val cryptoPw=crypto(pw)
            val member = repository.save(Member(id, pw, name, sex))
            if(id.isNotEmpty()) {
                assert(member.id.isNotEmpty())
                model.addAttribute("title", "sign success")
            }
        }catch(e:Exception){
            e.printStackTrace()
        }

        return "index"
    }

    @PostMapping("/login")
    fun postLogin(model:Model,
                  session: HttpSession,
                  @RequestParam(value="id")id:String,
                  @RequestParam(value="password")pw:String):String{
        var pageName:String = ""

        val member = repository.findById(id).orElseThrow()

        if(member.pw!=pw){
            model.addAttribute("title", "fail")
            pageName = "login"
        }else {
            session.setAttribute("info", member)
            model.addAttribute("hi", member.id)
            model.addAttribute("title", member.name)
            pageName = "welcome"
        }

        return pageName
    }

}