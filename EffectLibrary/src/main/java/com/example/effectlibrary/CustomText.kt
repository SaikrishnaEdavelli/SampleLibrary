package com.example.effectlibrary

import android.content.Context
import android.widget.TextView


class CustomText {
    fun toastMessage(context: Context, message: String) {
        TextView.TEXT_ALIGNMENT_CENTER
        TextView(context).text = message
        TextView(context).textSize = 26F
    }
}