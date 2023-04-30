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

class ChatAdapter(dataList: ArrayList<ProfileModel>) : RecyclerView.Adapter<ChatAdapter.ChatsHolder>() {

    var dataList = dataList
    lateinit var context : Context

    class ChatsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ChatsHolder {
        context = parent.context
        var View = LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false)
        return ChatsHolder(View)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ChatsHolder, position: Int) {
        holder.image.setImageResource(dataList.get(position).image)
        holder.name.text = dataList.get(position).name
    }

}