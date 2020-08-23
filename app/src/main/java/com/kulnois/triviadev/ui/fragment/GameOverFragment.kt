package com.kulnois.triviadev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.kulnois.triviadev.R
import com.kulnois.triviadev.databinding.FragmentGameBinding
import com.kulnois.triviadev.databinding.FragmentGameOverBinding

/**
 * Created by @kulnois on 23/08/2020.
 */

class GameOverFragment : Fragment() {

    private lateinit var binding: FragmentGameOverBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_over, container, false)
        iniUI()
        return binding.root
    }

    private fun iniUI() {
        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
    }
}