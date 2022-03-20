package com.example.medicaltraining.receptionist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.medicaltraining.R
import java.util.*


class Loading : Fragment() {
    private var mTimer: Timer? = null
    private var mTimerTask: TimerTask? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_loading, container, false)

        mTimerTask = object : TimerTask() {
            override fun run() {
                showFragment(LoginFragment())
            }
        }
        mTimer = Timer()
        mTimer!!.schedule(mTimerTask, 3000)


        return view;
    }




    private fun showFragment(fragment: Fragment) {
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, fragment)
            .addToBackStack(null)
            .commit()
    }

}