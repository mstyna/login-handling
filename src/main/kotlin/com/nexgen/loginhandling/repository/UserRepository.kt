package com.nexgen.loginhandling.repository

import com.nexgen.loginhandling.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
}