package com.nexgen.loginhandling.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LoginController () {

    @GetMapping("/login")
    fun showLoginForm(model : Model) : String {
        return "/login/login"
    }
}