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
        val contactName = binding.editTextContactName.text.toString()
        val contactNumber = binding.editTextContactNumber.text.toString()
        val myDisplayName = binding.editTextMyDisplayName.text.toString()
        val includeJunior = binding.checkBoxJunior.isChecked
        val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
        val immediateStart = binding.checkBoxImmediateStart.isChecked
        val startDate = binding.editTextStartDate.text.toString()

        val testString = "Contact Name: $contactName, Contact Number: $contactNumber"
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()

    }
}