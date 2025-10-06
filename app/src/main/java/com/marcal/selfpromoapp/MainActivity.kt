package com.marcal.selfpromoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
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

        val spinnerValues: Array<String> = arrayOf("Test", "Developer", "Manager")
        val spinnerAdapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_dropdown_item,
            spinnerValues)
        binding.spinnerJobTitle.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {
        Log.d(
            "This is my TAG",
            "Currently, contactNameEditText is " + binding.editTextContactName.toString()
        )
        val contactName = binding.editTextContactName.text.toString()
        val contactNumber = binding.editTextContactNumber.text.toString()
        val myDisplayName = binding.editTextMyDisplayName.text.toString()
        val includeJunior = binding.checkBoxJunior.isChecked
        val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
        val immediateStart = binding.checkBoxImmediateStart.isChecked
        val startDate = binding.editTextStartDate.text.toString()

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("Contact Name", contactName)
        previewActivityIntent.putExtra("Contact Number", contactNumber)
        previewActivityIntent.putExtra("My Display Name", myDisplayName)
        previewActivityIntent.putExtra("Include Junior", includeJunior)
        previewActivityIntent.putExtra("Job Title", jobTitle)
        previewActivityIntent.putExtra("Immediate Start", immediateStart)
        previewActivityIntent.putExtra("Start Date", startDate)
        startActivity(previewActivityIntent)
    }
}