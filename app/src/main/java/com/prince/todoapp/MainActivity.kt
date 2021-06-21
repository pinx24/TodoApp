package com.prince.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    val userName :String ="Admin"
    val passWord :String ="Admin"
    private lateinit var userNameInput : EditText
    private lateinit var passwordInput : EditText
   private lateinit var summitButtton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}