package xyz.ivaniskandar.shouko.util

import android.content.ComponentName
import android.content.Context
import android.content.Intent

fun String?.toComponentName(): ComponentName? {
    return if (this != null) {
        ComponentName.unflattenFromString(this)
    } else {
        null
    }
}

fun ComponentName?.loadLabel(context: Context): String? {
    return if (this != null) {
        Intent().apply { component = this@loadLabel }.loadLabel(context)
    } else {
        null
    }
}
