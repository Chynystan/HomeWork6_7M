package com.geektech.domain.domain.use_cases

import com.geektech.domain.domain.model.Note
import com.geektech.domain.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val repo: NoteRepository) {

    fun deleteNote(note: Note) = repo.deleteNote(note)
}