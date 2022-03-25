package com.example.medicaltraining.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.medicaltraining.Adapter
import com.example.medicaltraining.Model
import com.example.medicaltraining.R
import java.util.ArrayList


class NotificationFragment : Fragment() {

    var score_products = ArrayList<Model>()
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notification, container, false)
        recyclerView = view.findViewById(R.id.rv_advs)
        prepareData()
        val Adapter = Adapter(score_products)
        recyclerView!!.setAdapter(Adapter)
        return view
    }
    private fun prepareData() {
        val scoreModel = Model(R.drawable.user1,"Ebrahem Khaled","You have new call from manger","12:30 PM",R.drawable.avai)
        score_products.add(scoreModel)
        val scoreModel1 = Model(R.drawable.user2,"Ahmed Tamer","You have new task from manger","2:20 AM",R.drawable.avai)
        score_products.add(scoreModel1)
        val scoreModel2 = Model(R.drawable.user3,"Ziad Mohamed","You have Medical record","3:40 PM",R.drawable.avai)
        score_products.add(scoreModel2)
    }

}