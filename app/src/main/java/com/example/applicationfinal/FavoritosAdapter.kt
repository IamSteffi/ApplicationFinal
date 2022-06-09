package com.example.applicationfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class FavoritosAdapter: RecyclerView.Adapter<FavoritosAdapter.ViewHolder>(){

    val titulos = arrayOf("Teatro1","teatro 2")
    val fechas = arrayOf("10/08/2022","25/10/2022")
    val images = arrayOf(R.drawable.foto1,R.drawable.foto2)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false)
        return ViewHolder(v)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitulo.text = titulos[i]
        viewHolder.itemFecha.text = fechas[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titulos.size
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitulo: TextView
        var itemFecha: TextView
        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitulo = itemView.findViewById(R.id.item_titulo)
            itemFecha = itemView.findViewById(R.id.item_fecha)

        }
    }
}