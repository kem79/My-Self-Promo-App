package com.marcal.selfpromoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.marcal.selfpromoapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPreviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val contactName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val myDisplayName = intent.getStringExtra("My Display Name")
        val includeJunior = intent.getBooleanExtra("Include Junior", false)
        val jobTitle = intent.getStringExtra("Job Title")
        val immediateStart = intent.getBooleanExtra("Immediate Start", false)
        val startDate = intent.getStringExtra("Start Date")

        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My display name: $myDisplayName, include junior: $includeJunior, job title: $jobTitle"
        binding.textViewMessage.text = testString

    }
}