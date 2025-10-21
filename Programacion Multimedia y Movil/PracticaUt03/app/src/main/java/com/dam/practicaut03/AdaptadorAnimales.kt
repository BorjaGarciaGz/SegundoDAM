package com.dam.practicaut03

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdaptadorAnimales (datosAnimales: MutableList<Animal>):
        RecyclerView.Adapter<ViewHolderAnimales>() {
            private lateinit var animales: MutableList<Animal>

            init {
            this.animales=datosAnimales
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimales {
        // inflamos la vista (fila_pelicula.xml)
        val vista: View = LayoutInflater.from(parent.context).inflate(R.layout.fila_animales, parent, false)
        // Crear el viewholder a partir de esta vista.
        val viewHolder = ViewHolderAnimales(vista)
        return viewHolder
    }


    override fun getItemCount(): Int {


        return this.animales.size
    }


    override fun onBindViewHolder(holder: ViewHolderAnimales, position: Int) {
        // Dibujar la fila de la peli con los datos de la peli actualmente solicitada según la variable position
        val animales: Animal = this.animales[position]

        holder.textViewAlimentacion.text = animales.alimento
        holder.textViewReproduccion.text = animales.reproduccion
        Log.d("recycler", position.toString());
    }
}

