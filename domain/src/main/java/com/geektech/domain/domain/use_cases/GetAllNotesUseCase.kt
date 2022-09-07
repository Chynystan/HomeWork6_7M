package com.geektech.domain.domain.use_cases

import com.geektech.domain.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val repo: NoteRepository) {

    fun getAllNotes() = repo.getAllNotes()
}