package com.example.kodecamp.data

import com.example.kodecamp.R
import com.example.kodecamp.model.TopicsModel

class TopicSource {

    fun loadTopics() : List<TopicsModel>{
        return listOf(
            TopicsModel(R.string.topic_1, R.drawable.introduction),
            TopicsModel(R.string.topic_2, R.drawable.classesandobjects),
            TopicsModel(R.string.topic_3, R.drawable.classesandinheritance),
            TopicsModel(R.string.topic_4, R.drawable.conditionalstatement),
            TopicsModel(R.string.topic_5, R.drawable.materialdesign),
            TopicsModel(R.string.topic_6, R.drawable.listinkotlin),
            TopicsModel(R.string.topic_7, R.drawable.recycleview),
            TopicsModel(R.string.topic_8, R.drawable.collection),
            TopicsModel(R.string.topic_9, R.drawable.activitylifecycle),
            TopicsModel(R.string.topic_10, R.drawable.activitylifecycle),
            TopicsModel(R.string.topic_11, R.drawable.fragments),
            TopicsModel(R.string.topic_12, R.drawable.viewmodel),
            TopicsModel(R.string.topic_13, R.drawable.livedata),
            TopicsModel(R.string.topic_14, R.drawable.sharedviewmodel)
                )

    }
}