package com.example.projetorodrigolucasfumache

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.ImageView
import android.widget.TextView

class PaginaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicial)
        val nome = findViewById<TextView>(R.id.txtNome)
        val nomeuser = intent.getStringExtra("nome")
        nome.setText(nomeuser)

    }


}