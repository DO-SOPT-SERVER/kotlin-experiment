package com.example.kotlinseminar.controller

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/health")
class HealthCheckController {
    fun healthCheck(): String {
        return "OK"
    }
}
