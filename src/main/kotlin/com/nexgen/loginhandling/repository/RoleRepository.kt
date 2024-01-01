package com.nexgen.loginhandling.repository

import com.nexgen.loginhandling.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role, Int> {

    @Query(value = "select * from role_mst where role_id = :roleId", nativeQuery = true)
    fun getByRoleId(@Param("roleId") roleId: Int): Role?
}