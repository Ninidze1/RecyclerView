package com.example.recycleview

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CarAdapter(private val carList: List<CarList> )
    : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

        class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val ImageView: ImageView = itemView.findViewById(R.id.imageView2)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_list, parent, false)

        return CarViewHolder(view)

    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {

        val p = carList[position]
        val url: String? = p.url

        Glide.with(holder.ImageView.context)
            .load(url)
            .centerCrop()
            .into(holder.ImageView)

    }


    override fun getItemCount(): Int = carList.size


}