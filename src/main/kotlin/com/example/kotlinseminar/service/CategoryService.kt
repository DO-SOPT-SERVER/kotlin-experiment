package com.example.kotlinseminar.service

import com.example.kotlinseminar.repository.CategoryJpaRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(
    private val categoryJpaRepository: CategoryJpaRepository,
)
