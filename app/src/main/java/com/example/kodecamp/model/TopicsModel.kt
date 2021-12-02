package com.example.kodecamp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TopicsModel(
    @StringRes val stringResourceId : Int,
    @DrawableRes val imageResourceId : Int)
