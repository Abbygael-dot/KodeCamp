package com.example.kodecamp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kodecamp.R
import com.example.kodecamp.data.KeyFeaturesSource
import com.example.kodecamp.fragments.ListOfTopics
import com.example.kodecamp.fragments.TopicDetails
import com.example.kodecamp.model.KeyFeaturesModel
import com.example.kodecamp.model.TopicsModel
import org.w3c.dom.Text

class KeyFeaturesAdapter(private val context: TopicDetails, private val dataSet: List<KeyFeaturesModel>):
        RecyclerView.Adapter<KeyFeaturesAdapter.KeyFeaturesViewHolder>(){



    class KeyFeaturesViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val keyTxt : TextView = view.findViewById(R.id.key)
        val keyTxtDesc : TextView = view.findViewById(R.id.keyDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyFeaturesViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.key_features, parent, false)
        return KeyFeaturesAdapter.KeyFeaturesViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: KeyFeaturesViewHolder, position: Int) {
        val keyItem = dataSet[position]
        holder.keyTxt.text = context.resources.getString(keyItem.keyHeading)
        holder.keyTxtDesc.text = context.resources.getString(keyItem.keyDescription)
    }

    override fun getItemCount()= dataSet.size

}