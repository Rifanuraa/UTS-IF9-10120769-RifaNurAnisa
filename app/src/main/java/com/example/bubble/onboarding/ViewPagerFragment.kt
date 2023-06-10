package com.example.bubble.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bubble.R
import com.example.bubble.onboarding.screens.FirstScreen
import com.example.bubble.onboarding.screens.SecondScreen
import com.example.bubble.onboarding.screens.ThirdScreen



class ViewPagerFragment : Fragment() {
    private var _binding: ViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View ? {
        // Inflate the layout for this fragment
        _binding = ViewPagerBinding.inflate(inflater, container,false )


            view.viewPager

        return binding.root



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}