package com.kevin.whatsapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.kevin.whatsapp.Model.ProfileModel
import com.kevin.whatsapp.R
import de.hdodenhof.circleimageview.CircleImageView

class CallsAdapter (callsList: ArrayList<ProfileModel>) : RecyclerView.Adapter<CallsAdapter.CallsHolder>() {

    var callsList = callsList
    lateinit var context: Context

    class CallsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<CircleImageView>(R.id.profile2)
        var name = itemView.findViewById<TextView>(R.id.name2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallsHolder {
        context = parent.context
        var View = LayoutInflater.from(parent.context).inflate(R.layout.calls_item,parent,false)
        return CallsHolder(View)
    }

    override fun getItemCount(): Int {
        return callsList.size
    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {
        holder.image.setImageResource(callsList.get(position).image)
        holder.name.text = callsList.get(position).name
    }

}