package com.flyco.tablayout.bean

import androidx.annotation.StringDef


data class TabV3Title constructor (@TabTitleType val type:String, val content:Any){
}

@Retention(AnnotationRetention.SOURCE)
@StringDef(
    value = [
        TabTitleType.TEXT,
        TabTitleType.IMAGE,
    ]
)
annotation class TabTitleType {
    companion object {
        const val TEXT = "text"
        const val IMAGE = "image"
    }
}