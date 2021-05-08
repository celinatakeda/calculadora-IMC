package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String) {
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc= peso / (altura * altura)

            IrParaResult(imc)
        }else {
            Toast.makeText(this, "Valor nulo não é aceito", Toast.LENGTH_SHORT).show()

        }
    }

    private fun IrParaResult(imc:Float) {
        val resultTela = Intent(this, Result::class.java)
            resultTela.putExtra("IMC", imc)
            startActivity(resultTela)
        }
    }











