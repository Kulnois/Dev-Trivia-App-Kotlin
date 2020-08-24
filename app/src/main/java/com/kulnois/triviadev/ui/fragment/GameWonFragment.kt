package com.kulnois.triviadev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.kulnois.triviadev.R
import com.kulnois.triviadev.databinding.FragmentGameWonBinding

/**
 * Created by @kulnois on 23/08/2020.
 */

class GameWonFragment : Fragment() {

    private lateinit var binding: FragmentGameWonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, container, false)
        initUI()
        return binding.root
    }

    private fun initUI() {
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().navigate(GameWonFragmentDirections.actionGameWonFragmentToGameFragment())
        }

        val args: GameWonFragmentArgs by navArgs()
        Toast.makeText(context, "GANASTE -- Preguntas Correctas: ${args.numCorrect}, Total: ${args.numQuestions}", Toast.LENGTH_LONG).show()
    }

}