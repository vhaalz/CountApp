package com.example.myapp

import kotlinx.coroutines.flow.MutableStateFlow
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CountViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(CountUiState())
    val uiState: StateFlow<CountUiState> =_uiState.asStateFlow()

    fun incrementCount(){
        _uiState.value = CountUiState(count = uiState.value.count+1)
    }

    fun resetCount(){
        _uiState.value = CountUiState(0)
    }
}