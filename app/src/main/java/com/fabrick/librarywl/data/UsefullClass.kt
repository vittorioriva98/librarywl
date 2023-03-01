package com.fabrick.librarywl.data

import android.content.Context
import com.fabrick.librarywl.BuildConfig
import com.fabrick.librarywl.R
import com.fabrick.librarywl.data.di.DaggerInstanceModule
import com.fabrick.librarywl.data.di.InstanceModule
import com.fabrick.librarywl.domain.UsefullClassInt
import com.fabrick.librarywl.provider.ContextProvider
import dagger.Component
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import javax.inject.Inject
import javax.inject.Singleton

public class UsefullClass @Inject constructor(
    private val phoneBookRepository: PhoneBookRepository
): UsefullClassInt {
    companion object {
        fun getInstance(): UsefullClassInt = DaggerInstanceModule.builder().build().getUsefullClass()
    }

    override fun printText() {
        //println(context.getString(R.string.text_to_print))
        phoneBookRepository.insertContact("pippo")
        println(phoneBookRepository.getContacts().joinToString { "$it, " })
    }

    override fun getUrl(): String = BuildConfig.URL

}