package com.nexgen.loginhandling.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController{
    @GetMapping("/welcome")
    fun index() : String {
        return "user/welcome"
    }
}