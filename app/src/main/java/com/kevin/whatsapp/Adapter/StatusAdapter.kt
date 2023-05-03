package com.kevin.whatsapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kevin.whatsapp.Model.ProfileModel
import com.kevin.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter (statusList: ArrayList<ProfileModel>): RecyclerView.Adapter<StatusAdapter.StatusHolder>() {

    var statusList = statusList
    lateinit var context :Context

    class StatusHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var image = itemView.findViewById<CircleImageView>(R.id.profile1)
        var name = itemView.findViewById<TextView>(R.id.name1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusHolder {
        context = parent.context
        var View = LayoutInflater.from(parent.context).inflate(R.layout.status_item,parent,false)
        return StatusHolder(View)
    }

    override fun getItemCount(): Int {
        return statusList.size
    }

    override fun onBindViewHolder(holder: StatusHolder, position: Int) {
        holder.image.setImageResource(statusList.get(position).image)
        holder.name.text = statusList.get(position).name
    }

}