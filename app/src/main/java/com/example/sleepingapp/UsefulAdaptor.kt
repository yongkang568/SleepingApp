package com.example.sleepingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UsefulAdaptor internal constructor(context: Context): RecyclerView.Adapter<UsefulAdaptor.UsefulViewHolder>(){
    //A reference to display ViewHolder
    private val inflatel: LayoutInflater = LayoutInflater.from(context)
    //A reference to Useful record(s)
    private val usefulRecords = emptyList<Useful>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsefulViewHolder {
        val itemView = inflatel.inflate(R.layout.recyclerview_item, parent,false)
        return UsefulViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return usefulRecords.size
    }

    override fun onBindViewHolder(holder: UsefulViewHolder, position: Int) {
        val usefulRec = usefulRecords.get(position)
        holder.textViewName.text = usefulRec.name
        holder.textViewAge.text = usefulRec.age.toString()
    }

    inner class UsefulViewHolder(itemView: View):
            RecyclerView.ViewHolder(itemView){
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)

        val textViewAge: TextView = itemView.findViewById(R.id.textViewAge)
    }


}