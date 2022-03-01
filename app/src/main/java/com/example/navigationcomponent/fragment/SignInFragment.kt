package com.example.navigationcomponent.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import com.example.navigationcomponent.activity.HomeActivity
import com.example.navigationcomponent.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    private lateinit var binding : FragmentSignInBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSignInBinding.inflate(inflater, container, false)

        binding.btnSignIn.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
        }

        binding.tvSignUp.setOnClickListener {
            val navAction = SignInFragmentDirections.actionSignInFragmentToSignUpFragment()
            findNavController().navigate(navAction)
        }

        return binding.root
    }
}