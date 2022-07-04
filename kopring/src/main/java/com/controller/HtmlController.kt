package com.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun index(model : Model):String{
        return "index"
    }

    @GetMapping("/sign")
    fun sign(model : Model):String{
        return "sign"
    }

}