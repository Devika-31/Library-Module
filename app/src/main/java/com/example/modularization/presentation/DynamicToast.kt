package com.example.modularization.presentation

import android.content.Context
import android.widget.Toast


object DynamicToast {
    fun printToastMessage(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}