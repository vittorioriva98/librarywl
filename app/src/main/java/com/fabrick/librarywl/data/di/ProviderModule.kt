package com.fabrick.librarywl.data.di

import com.fabrick.librarywl.data.PhoneBookRepository
import com.fabrick.librarywl.data.UsefullClass
import com.fabrick.librarywl.domain.PhoneBookRepositoryInt
import com.fabrick.librarywl.domain.UsefullClassInt
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
internal abstract class ProviderModule {

    @Binds
    @Singleton
    abstract fun bindPhoneBookRepositoryInt(phoneBookRepository: PhoneBookRepository): PhoneBookRepositoryInt

    @Binds
    @Singleton
    abstract fun bindUsefullClassInt(usefullClass: UsefullClass): UsefullClassInt
}