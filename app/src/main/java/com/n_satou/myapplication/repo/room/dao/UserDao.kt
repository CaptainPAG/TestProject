package com.n_satou.myapplication.repo.room.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.n_satou.myapplication.repo.room.entry.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(user: User)

    @Query("SELECT * FROM User")
    fun findUsers(): List<User>

    @Query("SELECT * FROM User WHERE id = :id")
    fun findUser(id: Long): User

}