package com.nexgen.loginhandling.entity

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "role_tbl")
class Role(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    var roleId: Int = 0,

    @Column(name = "role_name")
    var roleName: String = ""
) : Serializable