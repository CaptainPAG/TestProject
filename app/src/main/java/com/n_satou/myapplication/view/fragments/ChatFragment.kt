package com.n_satou.myapplication.view.fragments

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.n_satou.myapplication.R
import com.n_satou.myapplication.databinding.FragmentChatBinding
import com.n_satou.myapplication.view.adapters.ChatAdapter

/**
 * Created by N-Satou on 2018/06/12.
 */
class ChatFragment: Fragment() {

    private lateinit var binding: FragmentChatBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container!!, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        initView()
    }

    private fun initAdapter() {
        binding.recyclerView.also {
            it.setHasFixedSize(true)
            it.adapter = ChatAdapter()
        }
    }

    private fun initView() {
        initHeaderImage()
    }

    private fun initHeaderImage() {
        Glide.with(this)
                .load("https://cdn4.roomclip.jp/v1/1536/roomclip-bucket/img_1536/eef7c336d6922830fe3830eb030c585175315f0e.jpg")
                .into(binding.imageView)

    }

}