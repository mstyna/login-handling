package com.nexgen.loginhandling.entity

import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "login_user_tbl")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    var userId: Int = 0,

    @Column(name = "email")
    var email: String = "",

    @Column(name = "password")
    var password: String = "",

    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
        name = "user_role_tbl",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    var role: Set<Role>

) : Serializable