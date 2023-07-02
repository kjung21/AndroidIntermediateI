package com.example.shamelessselfpromo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.shamelessselfpromo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPreview.setOnClickListener {
            onPreviewClicked()
        }

        val spinnerValues =
            arrayOf("Android Developer", "Android Engineer", "Android Ninja", "Android Wizard")
        val spinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerValues)
        binding.spinnerJobTitle.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {
        val message = Message(
            binding.editTextContactName.text.toString(),
            binding.editTextContactNumber.text.toString(),
            binding.editTextMyDisplayName.text.toString(),
            binding.checkBoxJunior.isChecked,
            binding.spinnerJobTitle.selectedItem?.toString(),
            binding.checkBoxImmediateStart.isChecked,
            binding.editTextStartDate.text?.toString()
        )

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        previewActivityIntent.putExtra("message", message)
        startActivity(previewActivityIntent)
    }
}