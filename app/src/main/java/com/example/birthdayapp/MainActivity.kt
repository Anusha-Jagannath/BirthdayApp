package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdayapp.databinding.ActivityMainBinding
import java.util.function.BinaryOperator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val NAME = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitBtn.setOnClickListener {
            val intent = Intent(this, BirthdayActivity::class.java)
            intent.putExtra(NAME, binding.nameEditText.text.toString().trim())
            startActivity(intent)

        }
    }
}