package com.nexgen.loginhandling.model

import java.io.Serializable

data class UserModel(
     var firstName : String,
     var lastName : String,
     var email : String,
     var password : String ,
     var confirmPass : String
) : Serializable