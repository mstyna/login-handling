package com.nexgen.loginhandling.controller

import com.nexgen.loginhandling.entity.User
import com.nexgen.loginhandling.model.UserModel
import com.nexgen.loginhandling.repository.UserRepository
import jakarta.validation.Valid
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController(
    val userRepository: UserRepository
) {
    @GetMapping("/register")
    fun index(model: Model) : String {
        val userModel = UserModel("","","","","")
        model.addAttribute("it", userModel)
        return "user/registration"
    }


    @PostMapping("/save")
    fun registerUser( @ModelAttribute @Valid userModel: UserModel, error: Error) : String {
        var user = User(0, userModel.firstName, userModel.lastName, userModel.email, userModel.password)
        userRepository.save(user)
        return "user/welcome"
    }
}