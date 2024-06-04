package com.example.authapp.data.network

import android.accounts.AccountManager
import android.content.Context
import android.os.Bundle
import java.util.logging.Handler


//class LoginRequest(context: Context) {
//    val am: AccountManager = AccountManager.get(context)
//    val options = Bundle()
//
//    fun authenticate() {
//        am.getAuthToken(
//        myAccount_,                     // Account retrieved using getAccountsByType()
//        "Login",            // Auth scope
//        options,                        // Authenticator-specific options
//        this,                           // Your activity
//        OnTokenAcquired(),              // Callback called when a token is successfully acquired
//        Handler(OnError())              // Callback called if an error occurs
//        )
//    }
//
//
//}
//
//
//private fun OnTokenAcquired(): String{
//    return "200"
//}
//
//private fun OnError(errorMessage: String): String{
//    return errorMessage
//}