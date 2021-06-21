package com.example.randomapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotepadAdapter(private val cardList: List<CardItem>) : RecyclerView.Adapter<NotepadAdapter.NotepadViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotepadViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.activity_card,parent,false)

        return NotepadViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotepadViewHolder, position: Int) {
        val currentCardItem = cardList[position]
        holder.text.text = currentCardItem.text
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    class NotepadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val text : TextView = itemView.findViewById(R.id.cardTextView)
    }
}