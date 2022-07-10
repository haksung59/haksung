package com.springtest.controller

import com.springtest.MemberRepository
import com.springtest.entity.Member
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.security.MessageDigest

@RestController
class TestController {

    @Autowired
    lateinit var repository: MemberRepository

    //암호화
    fun crypto(ss:String):String{
        val sha= MessageDigest.getInstance("SHA-256")
        val hexa=sha.digest(ss.toByteArray())
        return hexa.fold("", {str, it -> str + "%02x".format(it)})
    }

    @PostMapping("/sign")
    @ResponseBody
    fun sign (@RequestBody inputMember:Member
    ):Member{

        try {
            val cryptoPw=crypto(inputMember.pw)
            val member = repository.save(Member(inputMember.id, cryptoPw, inputMember.name, inputMember.sex))

            return member
        }catch(e:Exception){
            e.printStackTrace()
        }

        return Member("", "", "", "")

    }

    @PostMapping("/login")
    @ResponseBody
    fun login(@RequestBody inputMember:Member
    ) : Member {
        val cryptoPw = crypto(inputMember.pw)
        var member:Member = Member("","","","")
        try{
            member=repository.findById(inputMember.id).get()
        }catch(e:Exception){

        }

        if(cryptoPw!=member.pw){
            member.id = ""
            member.pw = ""
            member.name = ""
            member.sex = ""
        }

        return member

    }

    @GetMapping("/")
    fun hihohoho():Member{
        val member : Member = repository.findById("haksung").orElseThrow()

        println(member.id)
        return member
    }

}