package com.example.medicaltraining.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.medicaltraining.*

class StartUp1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start_up1, container, false)
        val btDoctor = view.findViewById<Button>(R.id.button_doctor)
        val btNurse = view.findViewById<Button>(R.id.button_Nurse)
        val btManger = view.findViewById<Button>(R.id.button_Manger)
        val btAnalysisEmployee = view.findViewById<Button>(R.id.button_Analysis_Employee)
        val btHR = view.findViewById<Button>(R.id.button_HR)
        val btReceptionist = view.findViewById<Button>(R.id.button_Receptionist)

        btDoctor.setOnClickListener{
            val intent = Intent(activity, DoctorActivity::class.java)
            startActivity(intent)
        }
        btNurse.setOnClickListener{
            val intent = Intent(activity, NurseActivity::class.java)
            startActivity(intent)
        }
        btManger.setOnClickListener{
            val intent = Intent(activity, MangerActivity::class.java)
            startActivity(intent)
        }
        btAnalysisEmployee.setOnClickListener{
            val intent = Intent(activity, AnalysisEmployeeActivity::class.java)
            startActivity(intent)
        }
        btHR.setOnClickListener{
            val intent = Intent(activity, HRActivity::class.java)
            startActivity(intent)
        }
        btReceptionist.setOnClickListener{
            val intent = Intent(activity, ReceptionistActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}