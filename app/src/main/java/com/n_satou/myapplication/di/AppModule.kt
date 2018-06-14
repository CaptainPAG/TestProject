package com.n_satou.myapplication.di

import android.content.Context
import com.n_satou.myapplication.view.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [
    RoomModule::class
])
internal object AppModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(appContext: MyApplication): Context {
        return appContext
    }
}