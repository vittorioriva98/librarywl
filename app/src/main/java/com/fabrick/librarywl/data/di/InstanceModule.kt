package com.fabrick.librarywl.data.di

import com.fabrick.librarywl.data.SingletonClass
import com.fabrick.librarywl.domain.UsefullClassInt
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ProviderModule::class])
internal interface InstanceModule {

    fun getUsefullClass(): UsefullClassInt

    fun getSingletonClass(): SingletonClass

}