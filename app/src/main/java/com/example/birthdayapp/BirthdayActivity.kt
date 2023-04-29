package com.example.birthdayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdayapp.databinding.ActivityBirthdayBinding

class BirthdayActivity : AppCompatActivity() {


    private lateinit var binding: ActivityBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(MainActivity.NAME)
        binding.nameTv.text = "Happy birthday $name!"

    }
}