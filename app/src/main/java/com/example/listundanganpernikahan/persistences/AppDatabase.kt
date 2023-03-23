package com.example.listundanganpernikahan.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.listundanganpernikahan.model.ListUndangan

@Database(entities = [ListUndangan::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun listUndanganDao(): ListUndanganDao
}