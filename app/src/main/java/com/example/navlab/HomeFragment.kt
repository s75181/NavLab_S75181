
package com.example.navlab

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onAttach(context: android.content.Context) {
        super.onAttach(context)
        Log.d("LC_Home", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LC_Home", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("LC_Home", "onCreateView")
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LC_Home", "onViewCreated")

        view.findViewById<Button>(R.id.btnDetail).setOnClickListener {
            findNavController().navigate(
                R.id.action_home_to_detail,
                Bundle().apply { putInt("itemId", 5) }
            )
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LC_Home", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LC_Home", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LC_Home", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LC_Home", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LC_Home", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LC_Home", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LC_Home", "onDetach")
    }
}
