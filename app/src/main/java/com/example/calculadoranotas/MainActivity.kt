package com.example.calculadoranotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener {
            val nota1 = nota1.text.toString().toFloatOrNull()
            val nota2 = nota2.text.toString().toFloatOrNull()
            val aps = aps.text.toString().toFloatOrNull()

            if (nota1 != null && nota2 != null && aps != null) {
                val media = (nota1 * 0.4) + (nota2 + aps) * 0.6
                //val number2digits: Double = String.format("%.2f", media).toDouble()

                if (media >= 6) {
                    resultado.text ="Aluno Aprovado\nMédia final: %.2f".format(media)
                    resultado.setTextColor(Color.GREEN)
                } else {
                    resultado.text = "Aluno Reprovado\nMédia final: %.2f".format(media)
                    resultado.setTextColor(Color.RED)
                }
            }
        }

    }
}