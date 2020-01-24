package com.example.recyclerview.utils

import java.text.SimpleDateFormat
import java.util.*

class ToSimpleString {
    companion object {
        fun convert(date: Date?) = with(date ?: Date()) {
            SimpleDateFormat("dd/MM/yyy").format(this)
        }
    }
}