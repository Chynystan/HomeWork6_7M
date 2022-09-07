package com.geektech.domain.domain.repository

import com.geektech.core.core.Resource
import com.geektech.domain.domain.model.Note
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun addNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>

    fun deleteNote(note: Note) : Flow<Resource<Unit>>

    fun editNote(id: Int, note: Note) : Flow<Resource<Unit>>

}