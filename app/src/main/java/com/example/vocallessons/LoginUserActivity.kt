package com.example.vocallessons

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.vocallessons.databinding.ActivityLoginUserBinding

class LoginUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            goSignUpUser.setOnClickListener {
                startActivity(Intent(this@LoginUserActivity, SignUpUserActivity::class.java))
            }
            createAccountBtn.setOnClickListener {
                startActivity(Intent(this@LoginUserActivity, MainActivity::class.java))
                finish()
            }

        }
    }
}
