package com.example.navigationcomponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.FragmentGetStartedBinding
import com.example.navigationcomponent.databinding.FragmentSignInBinding

class GetStartedFragment : Fragment() {

    private lateinit var binding : FragmentGetStartedBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentGetStartedBinding.inflate(inflater, container, false)

        binding.btnSignIn.setOnClickListener {
            val navAction = GetStartedFragmentDirections.actionGetStartedFragmentToSignInFragment()
            findNavController().navigate(navAction)
        }

        binding.btnSignUp.setOnClickListener {
            val navAction = GetStartedFragmentDirections.actionGetStartedFragmentToSignUpFragment()
            findNavController().navigate(navAction)
        }

        return binding.root
    }
}