package com.example.qoutiapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.qoutiapp.R
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
        fun bind(dataList: Shop) {
            Glide.with(itemView.context)
                .load("https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png${dataList.url}")
                .into(binding.imgMalls)
            binding.tvMallName.text = dataList.name

            if (dataList.new) {
                binding.tvNew.text = "New " + dataList.new
            }else{

            }
            binding.tvDaysName.text =  dataList.days
        }
    }
}