package com.example.madeinorenburgregion

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Button
import com.romainpiel.shimmer.Shimmer
import com.romainpiel.shimmer.ShimmerTextView

class AuthorBlank : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_author_blank, container, false)

        val shimmerTextView = view.findViewById<ShimmerTextView>(R.id.my_shimmer_text_view)
        val shimmerTextView2 = view.findViewById<ShimmerTextView>(R.id.my_shimmer_text_view2)
        val shimmer = Shimmer()
            .setDuration(1500)
            .setStartDelay(300)
            .setDirection(Shimmer.ANIMATION_DIRECTION_LTR)

        shimmer.start(shimmerTextView)
        shimmer.start(shimmerTextView2)
        val feedback: Button = view.findViewById(R.id.btnFeedBack)
        feedback.setOnClickListener {
            startActivity(Intent(activity, FeedBackActivity::class.java))
        }
        return view
    }
}