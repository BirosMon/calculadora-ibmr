package com.example.calculadoranotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        //val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = (nota1.text.toString()).toDouble()
            val nota2 = (nota2.text.toString()).toDouble()
            val aps = (aps.text.toString()).toDouble()

            val media = (nota1 * 0.4) + (nota2 + aps) * 0.6
            //val number2digits: Double = String.format("%.2f", media).toDouble()

            if (media >= 6) {
                resultado.setText(
                    """
                        Aluno Aprovado    
                        Média final: $media         
    """.trimIndent()
                )
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText(
                    """
                        Aluno Reprovado    
                        Média final: $media         
    """.trimIndent()
                )
                resultado.setTextColor(Color.RED)
            }
        }

    }
}