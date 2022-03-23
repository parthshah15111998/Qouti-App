package com.example.qoutiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.qoutiapp.adapter.MallAdapter
import com.example.qoutiapp.databinding.ActivityBrowserBinding
import com.example.qoutiapp.modelclass.Shop

class BrowserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrowserBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )

        binding.rcyItem.layoutManager = layoutManager

        var adapter = MallAdapter(
            listOf(
                Shop(
                    "name", "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png", "Fridays", false,
                    listOf("https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png", "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png")
                )
            )
        )
        binding.rcyItem.adapter = adapter
    }
}