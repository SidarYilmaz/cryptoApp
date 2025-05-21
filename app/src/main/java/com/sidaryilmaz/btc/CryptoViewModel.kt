package com.sidaryilmaz.btc

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sidaryilmaz.btc.api.CryptoItemModel
import com.sidaryilmaz.btc.api.CryptoModel
import com.sidaryilmaz.btc.repository.CryptoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CryptoViewModel : ViewModel(){
    private val repository = CryptoRepository()
    private val _state = MutableStateFlow<List<CryptoItemModel>>(emptyList())
    val state: StateFlow<List<CryptoItemModel>> = _state

    init {
        fetchData()
    }
    private fun fetchData(){
        viewModelScope.launch {
           _state.value= repository.getData().data
        }
    }
}