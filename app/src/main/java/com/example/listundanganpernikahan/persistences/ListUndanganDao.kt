package com.example.listundanganpernikahan.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.listundanganpernikahan.model.ListUndangan

@Dao
interface ListUndanganDao {
    @Query("SELECT * FROM ListUndangan")
    fun loadAll(): LiveData<List<ListUndangan>>

    @Query("SELECT * FROM ListUndangan WHERE id = :id")
    fun find(id: String): ListUndangan?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: ListUndangan)
    @Delete
    fun delete(item: ListUndangan)
}