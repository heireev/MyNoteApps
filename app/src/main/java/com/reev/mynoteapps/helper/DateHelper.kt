package com.reev.mynoteapps.helper

import android.annotation.SuppressLint
import android.icu.text.SimpleDateFormat
import java.util.*

object DateHelper {
    @SuppressLint("NewApi")
    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFormat.format(date)
    }
}