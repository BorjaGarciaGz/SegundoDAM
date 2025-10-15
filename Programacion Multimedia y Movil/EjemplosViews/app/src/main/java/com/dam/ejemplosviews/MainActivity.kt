package com.dam.ejemplosviews

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var primEtiq: TextView
    private lateinit var editTextNumber: EditText
    private lateinit var boton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        primEtiq = findViewById(R.id.main)
        editTextNumber = findViewById(R.id.etEjemplo)
        boton = findViewById(R.id.button_id)


        val number = 4
        editTextNumber.setText(number.toString())
        primEtiq.setText("He modificado mi etiqueta")

        boton = findViewById(R.id.button_id)
        boton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Log.i("boton", "boton pulsado:")
            }
        })
        boton = findViewById(R.id.button_id)
        boton.setOnClickListener{
            Log.i("boton", "boton pulsado:")
        }
    }
}
