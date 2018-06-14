package com.n_satou.myapplication.repo.room.dao

import android.arch.persistence.room.*
import com.n_satou.myapplication.repo.room.entry.Chat

@Dao
interface ChatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addChat(chat: Chat)

    @Query("SELECT * FROM Chat LIMIT 30")
    fun findPastChat(): List<Chat>

    @Query("DELETE FROM Chat")
    fun deleteAll()

}