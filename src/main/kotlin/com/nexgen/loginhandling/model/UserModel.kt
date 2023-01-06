package com.nexgen.loginhandling.model
import jakarta.validation.constraints.NotBlank
import java.io.Serializable

data class UserModel(
     @NotBlank
     var firstName : String,

     @NotBlank
     var lastName : String,

     @NotBlank
     var email : String,

     @NotBlank
     var password : String ,
     var confirmPass : String
) : Serializable