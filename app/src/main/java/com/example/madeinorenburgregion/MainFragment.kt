package com.example.madeinorenburgregion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout


class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val culture: ConstraintLayout = view.findViewById(R.id.cultureClick)
        culture.setOnClickListener{
            startActivity(Intent(activity, CultureActivity::class.java))
        }
        val brand: ConstraintLayout = view.findViewById(R.id.brandClick)
        brand.setOnClickListener{
            startActivity(Intent(activity, BrandActivity::class.java))
        }
        val attractions: ConstraintLayout = view.findViewById(R.id.attractionsClick)
        attractions.setOnClickListener {
            startActivity(Intent(activity, AttractionsActivity::class.java))
        }
    val but: Button = view.findViewById(R.id.button)
        but.setOnClickListener {
            startActivity(Intent(activity, TestActivity::class.java))
        }
        return view
    }
}