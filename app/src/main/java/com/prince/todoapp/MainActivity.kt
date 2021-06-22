package com.prince.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    val validUserName: String = "Admin"
    val validPassWord: String = "Admin"
    private lateinit var userNameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var summitButtton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput = findViewById(R.id.Username_Input)
        passwordInput = findViewById(R.id.Password_Input)
        summitButtton = findViewById(R.id.Summit_button)
        summitButtton.setOnClickListener {
            val username = userNameInput.text.toString()
            val password =passwordInput.text.toString()
            login(username,password)
        }


    }

    fun login(userName: String, passWord: String) {
        if (isValidCredentials(userName, passWord)) {
            val intent:Intent  =Intent(this, homeActivity::class.java)
            intent.putExtra("username", userName)
            startActivity(intent)
        }
    }else

        Toast.makeText(String = applicationContext, String = "Incorrect password", Toast.LENGTH_SHORT).show()
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        return (password == password)return true
    }
}