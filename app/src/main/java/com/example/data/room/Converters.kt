package com.example.data.room

import androidx.room.TypeConverter
import com.example.data.model.Subject
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class Converters {
    @TypeConverter
    fun fromSubjectList(value: List<Subject>): String {
        return Json.encodeToString(value)
    }

    @TypeConverter
    fun toSubjectList(value: String): List<Subject> {
        return Json.decodeFromString(value)
    }
}
