package com.geektech.data.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geektech.data.data.model.NoteEntity
import com.geektech.data.data.room.NoteDao

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}