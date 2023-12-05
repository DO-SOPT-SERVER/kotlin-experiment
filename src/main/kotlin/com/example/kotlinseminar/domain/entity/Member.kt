package com.example.kotlinseminar.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class Member(
    @Id @GeneratedValue
    val id: Long? = null,
    @Column(name = "name", columnDefinition = "varchar(255)", nullable = false)
    val name: String,
    var nickname: String,
    var age: Int,
)
