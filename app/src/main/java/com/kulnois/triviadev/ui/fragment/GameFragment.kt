package com.kulnois.triviadev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kulnois.triviadev.R
import com.kulnois.triviadev.databinding.FragmentGameBinding

/**
 * Created by @kulnois on 23/08/2020.
 */

class GameFragment: Fragment() {
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game, container, false)
        initUI()
        return binding.root
    }

    private fun initUI() {

    }
}
