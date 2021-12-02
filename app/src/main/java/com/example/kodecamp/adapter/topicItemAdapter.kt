package com.example.kodecamp.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kodecamp.R
import com.example.kodecamp.fragments.ListOfTopics
import com.example.kodecamp.model.TopicsModel

class TopicItemAdapter(private val context: ListOfTopics, private val dataSet: List<TopicsModel>):
RecyclerView.Adapter<TopicItemAdapter.TopicItemViewHolder>(){

    private lateinit var mListener : ClickListener

    interface ClickListener{
        fun onItemClick(position: Int)
    }

    fun setClickListener(listener : ClickListener){
        mListener = listener
    }


    class TopicItemViewHolder( view: View, listener : ClickListener) : RecyclerView.ViewHolder(view)  {

        val image : ImageView = view.findViewById(R.id.topic_image)
        val text : TextView = view.findViewById(R.id.topic_title)


        init {
            view.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.topic_item, parent, false)
        return TopicItemViewHolder(adapterLayout,mListener)
    }

    override fun onBindViewHolder(holder: TopicItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.text.text = context.resources.getString(item.stringResourceId)
        holder.image.setImageResource(item.imageResourceId)

       }

    override fun getItemCount() = dataSet.size

}