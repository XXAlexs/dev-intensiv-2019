package com.example.dev_intensive_2019.models

import java.util.*

class TextMessege(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id, from, chat, isIncoming, date) {


    override fun formatMessege(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}