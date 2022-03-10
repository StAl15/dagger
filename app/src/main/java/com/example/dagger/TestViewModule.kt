package com.example.dagger

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModule @ViewModelInject constructor(
    @Named("String2")
    testString2: String
): ViewModel() {

    init {
        Log.d("VM", "Test str from vm is: $testString2")
    }
}