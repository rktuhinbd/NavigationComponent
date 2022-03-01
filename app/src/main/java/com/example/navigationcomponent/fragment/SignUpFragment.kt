package com.example.navigationcomponent.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.activity.HomeActivity
import com.example.navigationcomponent.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)

        binding.btnSignUp.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
        }

        binding.tvSignIn.setOnClickListener {
            val navAction = SignUpFragmentDirections.actionSignUpFragmentToSignInFragment()
            findNavController().navigate(navAction)
        }

        return binding.root
    }
}