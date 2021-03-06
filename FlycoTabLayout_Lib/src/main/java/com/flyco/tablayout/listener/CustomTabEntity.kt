package com.flyco.tablayout.listener

import androidx.annotation.DrawableRes

interface CustomTabEntity {
    val tabTitle: String

    @get:DrawableRes
    val tabSelectedIcon: Int

    @get:DrawableRes
    val tabUnselectedIcon: Int
}