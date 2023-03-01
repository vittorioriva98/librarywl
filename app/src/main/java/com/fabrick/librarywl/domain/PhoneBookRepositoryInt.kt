package com.fabrick.librarywl.domain


interface PhoneBookRepositoryInt {

    fun getContacts(): List<String>

    fun insertContact(contact: String)

    fun deleteContact(contact: String)

}