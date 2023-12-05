package com.example.kotlinseminar.repository

import com.example.kotlinseminar.domain.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostJpaRepository : JpaRepository<Post, Long>
