package com.dam.ejemplosactividades

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var navegador: Button
    private lateinit var telefono: Button
    private lateinit var startForResult: ActivityResultLauncher<Intent>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //bindeo
        boton = findViewById(R.id.boton)
        navegador = findViewById(R.id.navegador)
        telefono = findViewById(R.id.telefono)

        //oyentes
        boton.setOnClickListener {
            val intent = Intent(this, MiSegundaActividad::class.java)
            intent.putExtra("usuario", "yo")
            startForResult.launch(intent)

            }

            startForResult = registerForActivityResult(
                ActivityResultContracts.StartActivityForResult()
            ) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    val data = result.data
                    if (data != null) {
                        val returnString = data.extras?.getString("stringdevuelta")
                        Log.d("intents", "Resultado devuelto: $returnString")

                    }
                }
            }

            navegador.setOnClickListener {
                val browserIntent = Intent(Intent.ACTION_VIEW, "https://www.xataka.com".toUri())
                if (browserIntent.resolveActivity(packageManager) != null) {
                    startActivity(browserIntent)
            }
        }

        telefono.setOnClickListener {

            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = "tel: 999555222".toUri()
            if(callIntent.resolveActivity(packageManager)!=null){
                startActivity(callIntent)
            }else {
                Log.e("MainActivity", "No hay aplicacióin montada para manejar la acción")
            }
        }
    }
}