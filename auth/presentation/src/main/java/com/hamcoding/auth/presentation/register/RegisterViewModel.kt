package com.hamcoding.auth.presentation.register

import androidx.lifecycle.ViewModel
import com.hamcoding.auth.domain.AuthRepository
import com.hamcoding.auth.domain.UserDataValidator

class RegisterViewModel(
    private val userDataValidator: UserDataValidator,
    private val repository: AuthRepository
) : ViewModel() {


}