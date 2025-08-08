package com.hamcoding.auth.domain

import com.hamcoding.core.domain.util.DataError
import com.hamcoding.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}