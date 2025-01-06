package com.example.vocallessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.vocallessons.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            goLoginUserPage.setOnClickListener {
                startActivity(Intent(this@SignUpUserActivity, LoginUserActivity::class.java))
            }
            createAccountBtn.setOnClickListener {
                startActivity(Intent(this@SignUpUserActivity, MainActivity::class.java))
                finish()
            }

        }
    }
}