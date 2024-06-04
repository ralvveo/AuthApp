package com.example.authapp.domain.repository

import com.example.authapp.domain.model.Account

object RegisteredAccounts {

    val ACCOUNT_1 = Account(login = "Test", password = "Test")
    val ACCOUNT_2 = Account(login = "vladimir_denisov@rambler.ru", password = "12345")

    val ACCOUNTS_LIST = listOf(ACCOUNT_1, ACCOUNT_2)
}