package com.n_satou.myapplication.repo.room.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.n_satou.myapplication.repo.room.dao.UserDao
import com.n_satou.myapplication.repo.room.entry.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class UserDataBase: RoomDatabase() {
    abstract fun userDao(): UserDao
}