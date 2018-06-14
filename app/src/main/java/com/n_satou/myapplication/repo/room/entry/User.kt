package com.n_satou.myapplication.repo.room.entry

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User (
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "id")
        val id: Long,

        @ColumnInfo(name = "name")
        val name: String,

        @ColumnInfo(name = "icon_url_str")
        val iconUrl: String
)