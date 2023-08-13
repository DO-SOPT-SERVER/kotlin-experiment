package com.example.kotlinseminar

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/health")
class HealthCheck {

    fun healthCheck(): String {
        return "OK"
    }

}