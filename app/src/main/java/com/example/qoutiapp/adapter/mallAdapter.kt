package com.example.qoutiapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.qoutiapp.adapter.mallAdapter.*
import com.example.qoutiapp.databinding.MallsImageBinding
import com.example.qoutiapp.modelDataClass.modelClass

class mallAdapter(private val dataList : List<modelClass>): RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder(var binding:MallsImageBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data: modelClass) {
            Glide.with(itemView.context).load("http://image.tmdb.org/t/p/w500${data.url}").into(binding.imgMalls)
            binding.tvMallName.text = "Title: "+data.name
            binding.tvNew.text = data.new
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding=MallsImageBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(dataList [position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}