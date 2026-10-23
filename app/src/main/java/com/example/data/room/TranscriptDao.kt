package com.example.data.room

import androidx.room.*
import com.example.data.model.Transcript
import kotlinx.coroutines.flow.Flow

@Dao
interface TranscriptDao {
    @Query("SELECT * FROM transcripts ORDER BY createdAt DESC")
    fun getAllTranscripts(): Flow<List<Transcript>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTranscript(transcript: Transcript)

    @Update
    suspend fun updateTranscript(transcript: Transcript)

    @Delete
    suspend fun deleteTranscript(transcript: Transcript)

    @Query("DELETE FROM transcripts WHERE id = :id")
    suspend fun deleteTranscriptById(id: String)
}
