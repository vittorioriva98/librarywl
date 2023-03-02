package com.fabrick.librarywl.data

import com.fabrick.librarywl.domain.UselessClassInt

internal class UselessClass(): UselessClassInt {

    var text = ""

    override fun youCannotSeeThisFun() {
        println("You cannot use this function")
    }

}