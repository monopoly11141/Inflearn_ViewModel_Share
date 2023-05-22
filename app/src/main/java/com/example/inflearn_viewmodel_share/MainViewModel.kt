package com.example.inflearn_viewmodel_share

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var countValue = 0

    fun plus() {
        countValue += 1
    }

    fun minus() {
        countValue -= 1
    }

}