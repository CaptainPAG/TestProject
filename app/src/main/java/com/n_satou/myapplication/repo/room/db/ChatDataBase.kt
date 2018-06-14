package com.n_satou.myapplication.repo.room.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.n_satou.myapplication.repo.room.dao.ChatDao
import com.n_satou.myapplication.repo.room.entry.Chat

@Database(entities = arrayOf(Chat::class), version = 1)
abstract class ChatDataBase: RoomDatabase() {
    abstract fun chatDao(): ChatDao
}