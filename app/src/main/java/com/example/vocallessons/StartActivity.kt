package com.example.vocallessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.vocallessons.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goUserButtonBtn.setOnClickListener {
            startActivity(Intent(this@StartActivity, LoginUserActivity::class.java))
            finish()
        }
    }
}
