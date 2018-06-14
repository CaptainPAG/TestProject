package com.n_satou.myapplication.repo.room.entry

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Chat(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id: Long,

        @ColumnInfo(name = "text")
        val text: String,

        @ColumnInfo(name = "user_id")
        val userId: Long
)