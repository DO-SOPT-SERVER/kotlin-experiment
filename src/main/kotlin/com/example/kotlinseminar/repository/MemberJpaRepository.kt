package com.example.kotlinseminar.repository

import com.example.kotlinseminar.domain.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository : JpaRepository<Member, Long> {
}