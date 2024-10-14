package com.example.kotlinbasicsocialmedia

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlinbasicsocialmedia.databinding.ActivityFeedBinding
import com.example.kotlinbasicsocialmedia.databinding.ActivityMainBinding
import com.example.kotlinbasicsocialmedia.databinding.ActivityUploadBinding

class UploadActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUploadBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        setContentView(R.layout.activity_upload)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun upload(view : View){

    }

    fun selectImage(view : View){

    }
}