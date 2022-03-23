package com.example.qoutiapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.qoutiapp.databinding.FragmentBrowserBinding

class BrowserFragment : Fragment() {
    private lateinit var binding: FragmentBrowserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBrowserBinding.inflate(inflater,container,false)

        return binding.root
    }
}