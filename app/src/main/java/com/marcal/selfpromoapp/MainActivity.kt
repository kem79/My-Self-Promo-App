package com.marcal.selfpromoapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.marcal.selfpromoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonPreview.setOnClickListener { view ->
            onPreviewClicked()
        }
    }

    private fun onPreviewClicked() {
        Log.d("This is my TAG", "Currently, contactNameEditText is " + binding.editTextContactName.toString())
        val testString = binding.editTextContactName.text.toString() + ", " + binding.editTextContactNumber.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }
}