package com.example.dev_intensive_2019.models

import java.util.*

abstract  class BaseMessage (
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date:Date = Date()
){

    abstract fun formatMessege() : String

}