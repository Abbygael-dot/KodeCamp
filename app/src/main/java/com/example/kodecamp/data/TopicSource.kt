package com.example.kodecamp.data

import com.example.kodecamp.R
import com.example.kodecamp.model.Topics

class TopicSource {

    fun loadTopics() : List<Topics>{
        return listOf(
            Topics(R.string.topic_1, R.drawable.introduction),
            Topics(R.string.topic_2, R.drawable.classesandobjects),
            Topics(R.string.topic_3, R.drawable.classesandinheritance),
            Topics(R.string.topic_4, R.drawable.conditionalstatement),
            Topics(R.string.topic_5, R.drawable.materialdesign),
            Topics(R.string.topic_6, R.drawable.listinkotlin),
            Topics(R.string.topic_7, R.drawable.recycleview),
            Topics(R.string.topic_8, R.drawable.collection),
            Topics(R.string.topic_9, R.drawable.activitylifecycle),
            Topics(R.string.topic_10, R.drawable.activitylifecycle),
            Topics(R.string.topic_11, R.drawable.fragments),
            Topics(R.string.topic_12, R.drawable.viewmodel),
            Topics(R.string.topic_13, R.drawable.livedata),
            Topics(R.string.topic_14, R.drawable.sharedviewmodel)
                )

    }
}