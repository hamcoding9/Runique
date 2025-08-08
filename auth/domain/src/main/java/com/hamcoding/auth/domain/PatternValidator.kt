package com.hamcoding.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}