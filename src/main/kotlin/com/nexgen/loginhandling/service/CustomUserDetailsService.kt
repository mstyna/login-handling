package com.nexgen.loginhandling.service

import com.nexgen.loginhandling.repository.UserRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class CustomUserDetailsService(
    private val userRepository: UserRepository
) : UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        val user = username?.let { userRepository.getByEmail(it) }
        user?.run {
            val authorities: Set<GrantedAuthority> = user.role.stream()
                .map { role -> SimpleGrantedAuthority(role.roleName) }
                .collect(Collectors.toSet())
            return User(username, user.password, authorities)
        } ?: throw UsernameNotFoundException(" User not exists by Username")
    }
}