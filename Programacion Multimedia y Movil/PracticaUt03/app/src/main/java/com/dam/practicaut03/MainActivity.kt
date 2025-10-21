package com.dam.practicaut03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewAnimal:  RecyclerView

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
        recyclerViewAnimal = findViewById(R.id.recyclerViewAnimales)
        recyclerViewAnimal.layoutManager = LinearLayoutManager(this)
        // La línea que divide los elementos
        recyclerViewAnimal.addItemDecoration(
            DividerItemDecoration(
                this@MainActivity,
                LinearLayoutManager.VERTICAL
            )
        )



        val animales= ArrayList<Animal>()
        animales.add(Animal("Conejo", "Herbivoro", "Viviparo"))
        animales.add(Animal("Gallina","Omnivoro", "Oviparo"))
        animales.add(Animal ("Águila", "Carvívoro", "Oviparo"))
        animales.add(Animal("Jirafa", "Herbivoro", "Viviparo"))
        animales.add(Animal("Cocodrilo", "Carvivoro", "Oviparo"))
        animales.add(Animal ("Elefante", "Herbivoro", "Viviparo"))
        animales.add(Animal("Gato", "Carnivoro", "Viviparo"))
        animales.add(Animal("Ratón", "Omnivoro", "Viviparo"))
        animales.add(Animal ("Murciélago","Omnivoro", "Viviparo"))
        animales.add(Animal("Perro","Carnivoro", "Viviparo"))
        animales.add(Animal("Pingüino","Carnivoto", "Oviparo"))
        animales.add(Animal ("Abeja","Herbivoro", "Oviparo"))


        val adaptadorRecyclerView = AdaptadorAnimales(animales)

        // El adaptador que se encarga de toda la lógica
        recyclerViewAnimal.setAdapter(adaptadorRecyclerView)

    }
}