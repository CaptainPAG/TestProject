package com.n_satou.myapplication.view.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.n_satou.myapplication.databinding.ViewPerChatBinding
import com.n_satou.myapplication.model.ChatModel

/**
 * Created by N-Satou on 2018/06/12.
 */
class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    var list: MutableList<ChatModel> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val model = list[position]

        // 別途Presenterを定義したらこっちから消そう
        Glide.with(holder.itemView.context)
                .load(model.user.userIcon)
                .into(holder.binding.userIconImageView)

        holder.binding.chatModel = model
    }

    override fun getItemCount(): Int  = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ViewPerChatBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    inner class ViewHolder(val binding: ViewPerChatBinding): RecyclerView.ViewHolder(binding.root) {

    }

}