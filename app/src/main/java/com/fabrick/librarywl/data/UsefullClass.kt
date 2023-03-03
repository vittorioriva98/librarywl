package com.fabrick.librarywl.data

import com.fabrick.librarywl.BuildConfig
import com.fabrick.librarywl.data.di.DaggerInstanceModule
import com.fabrick.librarywl.domain.UsefullClassInt
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
public class UsefullClass @Inject constructor(
    private val phoneBookRepository: PhoneBookRepository
): UsefullClassInt {

    private var name: String = ""
    companion object {

        private val instance = DaggerInstanceModule.builder().build().getUsefullClass()
        fun getInstance(): UsefullClassInt = instance
    }

    override fun setName(n: String) {
        name = n
    }

    override fun getName(): String = name

    override fun printText() {
        //println(context.getString(R.string.text_to_print))
        phoneBookRepository.insertContact("pippo")
        println(phoneBookRepository.getContacts().joinToString { "$it, " })
    }

    override fun getUrl(): String = BuildConfig.URL

}