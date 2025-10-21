package com.dam.practicaut03

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class ViewHolderAnimales(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
            val textViewTitulo: TextView
            val textViewAlimentacion: TextView
            val textViewReproduccion: TextView

            init {
                textViewTitulo = itemView.findViewById(R.id.filaTitulo)
                textViewAlimentacion = itemView.findViewById(R.id.filaAlimentacion)
                textViewReproduccion = itemView.findViewById(R.id.filaReproduccion)
            }
        }