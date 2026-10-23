package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity(tableName = "transcripts")
@Serializable
data class Transcript(
    @PrimaryKey val id: String = java.util.UUID.randomUUID().toString(),
    val studentName: String = "",
    val studentId: String = "",
    val studentRoll: String = "",
    val session: String = "",
    val schoolName: String = "",
    val schoolAddress: String = "",
    val schoolLogoUrl: String = "",
    val theme: String = "emerald",
    val subjects: List<Subject> = emptyList(),
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)

@Serializable
data class Subject(
    val name: String = "",
    val marks: Double = 0.0,
    val grade: String = "",
    val gradePoint: Double = 0.0,
    val credits: Double = 1.0
)
