package com.example.kotlinseminar.repository

import com.example.kotlinseminar.domain.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryJpaRepository : JpaRepository<Category, Long>
