package com.xuandq.todolist.model

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

@Parcelize
data class Task(
    val content: String,
    val isCheck: Boolean = false,
    val isImportant: Boolean = false,
    val createdTime: Long = System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true)
    val id: Int
) : Parcelable {
    val createdTimeFormat: String
        get() = DateFormat.getDateTimeInstance().format(createdTime)
}