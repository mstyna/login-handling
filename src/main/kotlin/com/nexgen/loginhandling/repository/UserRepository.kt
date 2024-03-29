package com.nexgen.loginhandling.repository

import com.nexgen.loginhandling.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Int> {

    @Query(value = "select * from login_user_tbl where email = :email", nativeQuery = true)
    fun getByEmail(@Param("email") email: String): User?
}