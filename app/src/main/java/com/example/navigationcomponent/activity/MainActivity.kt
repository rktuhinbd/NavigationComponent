package com.example.navigationcomponent.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigationcomponent.R
import com.example.navigationcomponent.databinding.ActivityMainBinding
import com.example.navigationcomponent.databinding.FragmentGetStartedBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

    }
}