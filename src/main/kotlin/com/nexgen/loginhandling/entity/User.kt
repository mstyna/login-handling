package com.nexgen.loginhandling.entity

import jakarta.persistence.*

@Entity
@Table(name = "User")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    var userId : Int = 0,

    @Column(name = "first_name")
    var firstName : String = "",

    @Column(name = "last_name")
    var lastName : String = "",

    @Column(name = "email")
    var email : String = "",

    @Column(name = "password")
    var password : String = "",
)