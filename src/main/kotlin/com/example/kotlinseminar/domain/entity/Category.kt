package com.example.kotlinseminar.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Category(
    @Id @GeneratedValue
    val id: Long,
    var name: String,
)
