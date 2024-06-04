package com.example.authapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.authapp.domain.model.Account
import com.example.authapp.domain.repository.RegisteredAccounts.ACCOUNTS_LIST
import com.example.authapp.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var login = ""

    var password = ""
    var account = Account("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            login = binding.loginText.text.toString()?: ""
            password = binding.passwordText.text.toString()?: ""
            account = Account(login, password)
            if (account in ACCOUNTS_LIST)
                loginSuccessful()
            else
                loginError()

        }

    }

    private fun loginSuccessful(){
        val displayIntent = Intent(this, SuccessActivity::class.java)
        startActivity(displayIntent)
    }

    private fun loginError(){
        MaterialAlertDialogBuilder(this)
            .setTitle("Ошибка входа") // Заголовок диалога
            .setMessage("Неверный логин или пароль. Попробуйте еще раз.") // Описание диалога
            .setNeutralButton("OК") { dialog, which ->
                // Действия, выполняемые при нажатии на кнопку «Отмена»
            }
            .show()

        binding.loginText.text.clear()
        binding.passwordText.text.clear()
    }

}