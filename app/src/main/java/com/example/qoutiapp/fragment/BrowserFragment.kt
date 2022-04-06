package com.example.qoutiapp.fragment

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.qoutiapp.LoginSignUpActivity
import com.example.qoutiapp.R
import com.example.qoutiapp.adapter.MallAdapter
import com.example.qoutiapp.databinding.FragmentBrowserBinding
import com.example.qoutiapp.modelclass.Shop

class BrowserFragment : Fragment() {
    private lateinit var binding: FragmentBrowserBinding
    lateinit var perferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        perferences = requireActivity().getSharedPreferences("pref", Context.MODE_PRIVATE)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBrowserBinding.inflate(inflater, container, false)

        val linearLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(
            context, LinearLayoutManager.VERTICAL, false
        )

        binding.rcyItem.layoutManager = linearLayoutManager

        val adapter = MallAdapter(
            listOf(
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                ),
                Shop(
                    "Name",
                    "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                    "friday",
                    false,
                    listOf(
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg",
                        "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg"
                    )
                )
            )
        )
        binding.rcyItem.adapter = adapter


        binding.imgAccountLogo.setOnClickListener {
            val editor: SharedPreferences.Editor = perferences.edit()
            perferences.getString("countryCode", "")
            perferences.getString("MobileNumber", "")
            editor.clear()
            editor.apply()

            val intent = Intent(activity, LoginSignUpActivity::class.java)
            startActivity(intent)
            activity?.finish()

        }

        return binding.root
    }

}