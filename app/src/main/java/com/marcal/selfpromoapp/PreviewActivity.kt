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

        // casting with "as"
        val message = intent.getSerializableExtra("Message") as Message

        // raw string with triple quotes
        val messagePreviewText = """
            Hi ${message.contactName},
            
            My name is ${message.myDisplayName}, and I am ${message.getFullJobDescription()}.
            
            I have a portfolio of apps to demonstrate my technical skills that i can show on request.
            
            I am able to start a new position ${message.getAvailability()}.
             
            Please get in touch if you have any suitable job for me. My PHone number is ${message.contactNumber}.
            
            Thanks and best regards.
        """.trimIndent()

        binding.textViewMessage.text = messagePreviewText

    }
}