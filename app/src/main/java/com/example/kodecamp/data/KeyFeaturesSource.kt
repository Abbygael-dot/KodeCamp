package com.example.kodecamp.data

import com.example.kodecamp.R
import com.example.kodecamp.model.KeyFeaturesModel

class KeyFeaturesSource {
    fun loadKeyFeatures() : List<KeyFeaturesModel>{
        return listOf(
            KeyFeaturesModel(R.string.key1, R.string.key1_desc),
            KeyFeaturesModel(R.string.key2, R.string.key2_desc),
            KeyFeaturesModel(R.string.key3, R.string.key3_desc),
            KeyFeaturesModel(R.string.key4, R.string.key4_desc),
            KeyFeaturesModel(R.string.key5, R.string.key5_desc),
            KeyFeaturesModel(R.string.key6, R.string.key6_desc),
            KeyFeaturesModel(R.string.key7, R.string.key7_desc),
            KeyFeaturesModel(R.string.key8, R.string.key8_desc),
            KeyFeaturesModel(R.string.key9, R.string.key9_desc)
        )

    }
}