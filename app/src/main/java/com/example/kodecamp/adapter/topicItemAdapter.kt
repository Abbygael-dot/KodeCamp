package com.example.kodecamp.adapter
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.kodecamp.R
import com.example.kodecamp.databinding.FragmentTopicDetailsBinding
import com.example.kodecamp.databinding.TopicItemBinding
import com.example.kodecamp.fragments.ListOfTopics
import com.example.kodecamp.fragments.TopicDetails
import androidx.appcompat.app.AppCompatActivity
import com.example.kodecamp.model.Topics

class topicItemAdapter(private val context: ListOfTopics, private val dataSet: List<Topics>):
RecyclerView.Adapter<topicItemAdapter.TopicItemViewHolder>(){


    class TopicItemViewHolder( val view: View) : RecyclerView.ViewHolder(view)  {

        val image : ImageView = view.findViewById(R.id.topic_image)
        val text : TextView = view.findViewById(R.id.topic_title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopicItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.topic_item, parent, false)
        return TopicItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TopicItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.text.text = context.resources.getString(item.stringResourceId)
        holder.image.setImageResource(item.imageResourceId)


//        holder.text.setOnClickListener {
//            val intent = Intent(this, TopicDetails::class.java)
//            context.startActivity(intent)
//        }

        holder.view.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: android.view.View?) {
                val activity = p0!!.context as AppCompatActivity
                val topicDetails = TopicDetails()
                activity.supportFragmentManager.beginTransaction().replace(R.id.rec, topicDetails).addToBackStack(null).commit()
            }
        })

//
//        holder.text.setOnClickListener {
//           val activity = holder.view.context as Activity
//           val intent = Intent(activity, TopicDetails::class.java)
//           intent.putExtra("topic", holder.text.text.toString() )
//           startActivity(intent)

       }

    override fun getItemCount() = dataSet.size

}