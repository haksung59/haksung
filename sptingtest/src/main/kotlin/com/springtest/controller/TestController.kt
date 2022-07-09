package com.springtest.controller

import com.springtest.MemberRepository
import com.springtest.entity.Member
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController {

    @Autowired
    lateinit var repository: MemberRepository

    @PostMapping("/hi")
    @ResponseBody
    fun index(@RequestParam(value="id")id:String,
              @RequestParam(value="pw")pw:String
    ) : Member {

        //아이디를 가지고 db 정보를 가져와서
        //json데이타러 반환.

        var member = repository.findById(id).orElseThrow()
        //val result = mapOf("id" to id, "pw" to pw)
        if(pw!=member.pw){
            member.id=""
            member.pw=""
            member.name=""
            member.sex=""
        }


        return member

    }

}