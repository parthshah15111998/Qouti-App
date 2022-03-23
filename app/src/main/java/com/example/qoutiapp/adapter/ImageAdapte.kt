package com.example.qoutiapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.qoutiapp.databinding.ImageBinding
import com.example.qoutiapp.modelclass.Shop

class ImageAdapter(private var imageList:List<Shop>) :RecyclerView.Adapter<ImageAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
       return holder.bind(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class ViewHolder(private var binding:ImageBinding):RecyclerView.ViewHolder(binding.root){
          @SuppressLint("CheckResult")
          fun bind(imageList: Shop){
              Glide.with(itemView.context)
                  .load("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg${imageList.list}")
                  .into(binding.imageMall)
          }
    }
}