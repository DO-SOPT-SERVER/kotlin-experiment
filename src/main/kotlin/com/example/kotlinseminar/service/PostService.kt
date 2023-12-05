package com.example.kotlinseminar.service

import com.example.kotlinseminar.repository.PostJpaRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postJpaRepository: PostJpaRepository,
)
