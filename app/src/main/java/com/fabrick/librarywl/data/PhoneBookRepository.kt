package com.fabrick.librarywl.data

import android.content.Context
import com.fabrick.librarywl.domain.PhoneBookRepositoryInt
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PhoneBookRepository @Inject constructor(): PhoneBookRepositoryInt {

    private val contacts: ArrayList<String> = arrayListOf()

    companion object {
        //fun getInstance(): PhoneBookRepositoryInt = Dagger
    }

    override fun getContacts(): List<String> {
        return contacts.toList()
    }

    override fun insertContact(contact: String) {
        contacts.add(contact)
    }

    override fun deleteContact(contact: String) {
        contacts.remove(contact)
    }
}