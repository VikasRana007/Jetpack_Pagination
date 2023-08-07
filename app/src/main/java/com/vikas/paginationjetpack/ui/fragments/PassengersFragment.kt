package com.vikas.paginationjetpack.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vikas.paginationjetpack.R

/**
 * A simple [Fragment] subclass.
 * Use the [PassengersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PassengersFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_passengers, container, false)
    }

}