package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

       var intent = intent
       val imcR = intent.getFloatExtra("IMC", 0F)

        tituloTXT.text ="Seu IMC é:\n%.2f ".format(imcR)
        //tituloTXT.text = "Seu IMC é: \n%.2f".format(imcR)

       voltarBTN.setOnClickListener {
           Voltar()
       }
    }
    private fun Voltar() {
        val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }




