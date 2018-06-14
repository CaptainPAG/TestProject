package com.n_satou.myapplication.di

import android.arch.persistence.room.Room
import com.n_satou.myapplication.repo.room.db.ChatDataBase
import com.n_satou.myapplication.repo.room.db.UserDataBase
import com.n_satou.myapplication.view.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RoomModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideChatDataBase(application: MyApplication): ChatDataBase {
        return Room.databaseBuilder(application, ChatDataBase::class.java, "chat-db").build()
    }

    @Singleton
    @Provides
    @JvmStatic
    fun provideUserDataBase(application: MyApplication): UserDataBase {
        return Room.databaseBuilder(application, UserDataBase::class.java, "user-db").build()
    }

}