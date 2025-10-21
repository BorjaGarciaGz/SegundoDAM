package com.dam.practicaut03

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdaptadorAnimales (datosAnimales: MutableList<Animal>): RecyclerView.Adapter<ViewHolderAnimales>() {
            private lateinit var animales: MutableList<Animal>

            init {
            this.animales=datosAnimales
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimales {

        val vista: View = LayoutInflater.from(parent.context).inflate(R.layout.fila_animales, parent, false)

        val viewHolder = ViewHolderAnimales(vista)
        return viewHolder
    }


    override fun getItemCount(): Int {


        return this.animales.size
    }


    override fun onBindViewHolder(holder: ViewHolderAnimales, position: Int) {

        val animales: Animal = this.animales[position]

        holder.textViewTitulo.text = animales.titulo
        holder.textViewAlimentacion.text = animales.alimento
        holder.textViewReproduccion.text = animales.reproduccion
        Log.d("recycler", position.toString());
    }
}

