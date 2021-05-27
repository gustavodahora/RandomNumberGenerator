package com.example.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.randomnumbergenerator.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun generate(view: View) {
        var minimum = binding.minimumValue.getText().toString().toInt()
        var maximum = binding.maximumValue.getText().toString().toInt()
        var calc = Random.nextInt(minimum, maximum)
        var generatedValue = binding.generatedValue
        generatedValue.setText(calc.toString())
    }
}