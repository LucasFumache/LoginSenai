package com.example.projetorodrigolucasfumache

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val COD_TELA = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun acessar(view: View){
        val editText=findViewById<TextView>(R.id.txtLogin)
        val mensagem = editText.text.toString()
        val intent = Intent(this, PaginaInicial::class.java).apply {
            putExtra("nome", mensagem)
        }
        startActivity(intent)
    }

}