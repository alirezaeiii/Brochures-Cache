package com.android.sample.bonial.di

import android.content.Context
import androidx.room.Room
import com.android.sample.bonial.R
import com.android.sample.bonial.database.BrochureDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(context: Context): BrochureDatabase {
        return Room.databaseBuilder(
            context,
            BrochureDatabase::class.java,
            context.getString(R.string.database)
        ).build()
    }

    @Singleton
    @Provides
    fun provideDashboardDao(db: BrochureDatabase) = db.brochureDao()
}