package com.example.listundanganpernikahan.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ListUndangan(
    @PrimaryKey val id: String,
    val kode: String,
    val nama: String,
    val alamat: String,
    val ucapan: String,
)