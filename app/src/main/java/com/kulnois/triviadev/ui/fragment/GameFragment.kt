package com.kulnois.triviadev.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.kulnois.triviadev.R
import com.kulnois.triviadev.data.model.Question
import com.kulnois.triviadev.databinding.FragmentGameBinding
import com.kulnois.triviadev.util.questions
import kotlin.math.min

/**
 * Created by @kulnois on 23/08/2020.
 */

class GameFragment: Fragment() {
    private lateinit var binding: FragmentGameBinding
    lateinit var currentQuestion: Question
    lateinit var answers: MutableList<String>
    private var questionIndex = 0
    private val numberQuestions = min((questions.size + 1) / 2, 3)
    private var VALUE_DEFAUL = -1

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
        randomizeQuestions()
        binding.question = this

        binding.submitButton.setOnClickListener { view: View ->
            val checkedId = binding.questionRadioGroup.checkedRadioButtonId

            if (VALUE_DEFAUL != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.secondAnswerRadioButton -> answerIndex = 1
                    R.id.thirdAnswerRadioButton -> answerIndex = 2
                    R.id.fourthAnswerRadioButton -> answerIndex = 3
                }

                if (answers[answerIndex] == currentQuestion.answers[0]) {
                    questionIndex++
                    if (questionIndex < numberQuestions) {
                        currentQuestion = questions[questionIndex]
                        setQuestions()
                        binding.invalidateAll()
                    } else {
                        view.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameWonFragment(numberQuestions, questionIndex))
                    }
                } else {
                    view.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameOverFragment())
                }


            }
        }
    }

    private fun randomizeQuestions() {
        questions.shuffle()
        questionIndex = 0
        setQuestions()
    }

    private fun setQuestions() {
        currentQuestion = questions[questionIndex]

        answers = currentQuestion.answers.toMutableList()
        answers.shuffle()

        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.home_dev_trivia_question, questionIndex + 1, numberQuestions)
    }
}
