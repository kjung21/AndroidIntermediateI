package com.example.shamelessselfpromo

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.shamelessselfpromo.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var message: Message
    private lateinit var messagePreviewText: String
    private lateinit var binding: ActivityPreviewBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayMessage()
        setupButton()
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun displayMessage() {
        message = intent.getSerializableExtra("message", Message::class.java)!!
        messagePreviewText = """
                Hi ${message.contactName},
                
                My name is ${message.myDisplayName} and I'm ${message.getFullJobDescription()}.
                
                I have a portfolio of apps to demonstrate my technical skills that I can show on request.
                
                I am able to start a new position ${message.getAvailability()}.
                
                Please get in touch if you have any suitable roles for me.
                
                Thanks and best regards.
            """.trimIndent()

        binding.textViewMessage.text = messagePreviewText
    }

    private fun setupButton() {
        binding.buttonSendMessage.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto:${message.contactNumber}")
                putExtra("sms_body", messagePreviewText)
            }
            startActivity(intent)
        }
    }
}