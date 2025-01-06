package com.example.vocallessons

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.vocallessons.databinding.ActivityConfirmationBinding
import java.util.Locale

class ConfirmationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmationBinding
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityConfirmationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            selectDateBtn.setOnClickListener {
                showDAtePicker()
            }
            confirmButton.setOnClickListener {
                startActivity(Intent(this@ConfirmationActivity, CongratsActivity::class.java))
            }
        }


    }

    private fun showDAtePicker() {
        val datePickerDialog =
            DatePickerDialog(
                this, { DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    val selectedDate = Calendar.getInstance()
                    selectedDate.set(year, monthOfYear, dayOfMonth)
                    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                    val formattedDate = dateFormat.format(selectedDate.time)
                    binding.userDateTv.text = "Selected Date:$formattedDate"
                },

                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)

            )
        datePickerDialog.show()
    }
}
