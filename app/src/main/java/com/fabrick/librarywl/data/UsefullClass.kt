package com.fabrick.librarywl.data

import android.content.Context
import com.fabrick.librarywl.BuildConfig
import com.fabrick.librarywl.R
import com.fabrick.librarywl.domain.UsefullClassInt
import com.fabrick.librarywl.provider.ContextProvider

class UsefullClass(): UsefullClassInt {

    private val context = ContextProvider().getCont()

    override fun printText() {
        println(context.getString(R.string.text_to_print))
    }

    override fun getUrl(): String = BuildConfig.URL

}