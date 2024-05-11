package com.example.simplemathquiz
import android.content.Intent

import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity


class NewGame : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.maingame)



        val newgame: Button = findViewById(R.id.newgame)





        newgame.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}