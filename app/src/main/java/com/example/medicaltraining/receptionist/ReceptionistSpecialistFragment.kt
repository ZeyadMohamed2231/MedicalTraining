package com.example.medicaltraining.receptionist

import android.app.Notification
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.medicaltraining.R
import com.example.medicaltraining.fragments.NotificationFragment


class ReceptionistSpecialistFragment : Fragment() {


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
        val view = inflater.inflate(R.layout.fragment_receptionist_specialist, container, false)

        val btNotification = view.findViewById<ImageButton>(R.id.notification_button_image)

        btNotification.setOnClickListener {
            showFragment(NotificationFragment())



        }

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