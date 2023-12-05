package com.example.kotlinseminar.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Post(
    @Id @GeneratedValue
    val id: Long,
    var title: String,
    var content: String,
) {
    fun updateContent(content: String) {
        this.content = content
    }

    fun updateTitle(title: String) {
        this.title = title
    }
}
