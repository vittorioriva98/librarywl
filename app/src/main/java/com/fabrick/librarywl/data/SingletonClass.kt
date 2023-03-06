package com.fabrick.librarywl.data

import com.fabrick.librarywl.data.di.DaggerInstanceModule
import com.fabrick.librarywl.domain.UsefullClassInt
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SingletonClass @Inject constructor(
    private val phoneBookRepository: PhoneBookRepository
) {

    var text = ""

    companion object {
        private var instance: SingletonClass? = null
        fun getInstance(): SingletonClass {
            if (instance == null)
                instance = DaggerInstanceModule.builder().build().getSingletonClass()
            return instance!!
        }
    }

    private fun init(): SingletonClass = DaggerInstanceModule.builder().build().getSingletonClass()

}