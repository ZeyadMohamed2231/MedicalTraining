package com.example.medicaltraining

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class Adapter(var list: ArrayList<Model>) : RecyclerView.Adapter<Adapter.Handler>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Handler {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_adv, parent, false)
        return Handler(view)
    }
    override fun onBindViewHolder(holder: Handler, position: Int) {
        val scoreModel = list[position]
        holder.imageView.setImageResource(scoreModel.imageUri)
        holder.nameText.setText(scoreModel.name)
        holder.infoText.setText(scoreModel.info)
        holder.dateText.setText(scoreModel.date)
        holder.imageView2.setImageResource(scoreModel.imageUri2)

    }
    override fun getItemCount(): Int {
        return list.size
    }



    inner class Handler(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView
        var nameText: TextView
        var infoText: TextView
        var dateText : TextView
        var imageView2 : ImageView

        init {
            imageView = itemView.findViewById(R.id.user_image)
            nameText = itemView.findViewById(R.id.user_name)
            infoText = itemView.findViewById(R.id.TextNum2)
            dateText = itemView.findViewById(R.id.phone_number_tv)
            imageView2 = itemView.findViewById(R.id.unseenImage)
        }
    }
}