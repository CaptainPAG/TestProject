package com.n_satou.myapplication.model

import java.util.*

data class ChatModel(
        val text: String,
        val date: Date,
        val dateTxt: String,
        val user: UserModel
)