package com.example.mvvmexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.data.model.QuoteModel
import com.example.mvvmexample.data.repository.QuoteRepository

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteRepository.random()
        quoteModel.postValue(currentQuote)
    }
}