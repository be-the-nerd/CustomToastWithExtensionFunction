package com.divyansh.customtoastwithextensionfunction

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.divyansh.customtoastwithextensionfunction.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCustomToast.setOnClickListener {
            Toast(this).showCustomToast(binding.etMessage.text.toString().trim(), this)
        }

    }
}