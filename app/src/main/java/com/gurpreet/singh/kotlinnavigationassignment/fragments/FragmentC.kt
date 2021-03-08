package com.gurpreet.singh.kotlinnavigationassignment.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.gurpreet.singh.kotlinnavigationassignment.R
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentABinding
import com.gurpreet.singh.kotlinnavigationassignment.databinding.FragmentCBinding


class FragmentC : Fragment() {
    val args: FragmentCArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

       Log.i("valuesPassed", args.stringPassed)

        var binding : FragmentCBinding
                    = DataBindingUtil.inflate(inflater, R.layout.fragment_c, container, false)

        return binding.root
    }
}