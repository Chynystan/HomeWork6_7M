package com.geektech.data.data.mapper

import com.geektech.data.data.model.NoteEntity
import com.geektech.domain.domain.model.Note

class NoteMapper {

    fun noteToNoteEntity(note: Note) = NoteEntity(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )

    fun noteEntityToNote(note: NoteEntity) = Note(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )
}