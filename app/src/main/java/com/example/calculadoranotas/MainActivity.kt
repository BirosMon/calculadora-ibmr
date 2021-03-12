package com.example.calculadoranotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListerners()
        }

    private fun setListerners(){
        calcular.setOnClickListener {
            somarNotas(nota1.text.toString(), nota2.text.toString(), aps.text.toString())
        }
    }
    private fun somarNotas(Nota1: String, Nota2: String, Aps: String) {
        val nota1 = Nota1.toFloatOrNull()
        val nota2 = Nota2.toFloatOrNull()
        val aps = Aps.toFloatOrNull()

        if (nota1 != null && nota2 != null && aps != null) {
            val media = (nota1 * 0.4) + (nota2 + aps) * 0.6

            if (media >= 6) {
                resultado.text = "Aluno Aprovado\nMédia final: %.2f".format(media)
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.text = "Aluno Reprovado\nMédia final: %.2f".format(media)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}