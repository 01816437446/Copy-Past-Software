package com.example.data.repository

import com.example.data.model.Transcript
import com.example.data.room.TranscriptDao
import kotlinx.coroutines.flow.Flow

class TranscriptRepository(private val transcriptDao: TranscriptDao) {

    fun observeTranscripts(): Flow<List<Transcript>> {
        return transcriptDao.getAllTranscripts()
    }

    suspend fun saveTranscript(transcript: Transcript) {
        val data = transcript.copy(
            updatedAt = System.currentTimeMillis()
        )
        transcriptDao.insertTranscript(data)
    }

    suspend fun deleteTranscript(id: String) {
        transcriptDao.deleteTranscriptById(id)
    }
}
