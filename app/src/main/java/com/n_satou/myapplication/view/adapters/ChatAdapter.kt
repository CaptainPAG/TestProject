package com.n_satou.myapplication.view.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by N-Satou on 2018/06/12.
 */
class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val text = holder.itemView as TextView
        text.text = "item + $position"
    }

    override fun getItemCount(): Int  = 100

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
            = ViewHolder(TextView(parent.context))

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

}