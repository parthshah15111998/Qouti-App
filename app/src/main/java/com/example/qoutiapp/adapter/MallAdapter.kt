package com.example.qoutiapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.qoutiapp.adapter.MallAdapter.*
import com.example.qoutiapp.databinding.MallsImageBinding
import com.example.qoutiapp.modelclass.Shop

class MallAdapter(private val dataList: List<Shop>) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = MallsImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(var binding: MallsImageBinding) : RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(shop: Shop) {
            Glide.with(itemView.context)
                .load(shop.url)
                .into(binding.imgMalls)
            binding.tvMallName.text = shop.name
            binding.images.adapter = ImageAdapter(shop.list)
            val linearLayoutManager =
                LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
            binding.images.layoutManager = linearLayoutManager
            if (shop.new) {
                binding.tvNew.text = "New " + shop.new
            } else {
//                binding.tvNew.visibility = GONE
            }

            binding.tvDaysName.text = shop.days
        }
    }
}