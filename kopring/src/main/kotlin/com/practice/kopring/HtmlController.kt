package com.practice.kopring

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
abstract class HtmlController {

    @RequestMapping("/")
    fun index(model: Model) : String {
        return "index"
    }


}