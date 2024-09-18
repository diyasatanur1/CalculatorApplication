package com.cs407.calculator_application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divisionButton)

        addButton.setOnClickListener {
            val number1 = firstNumber.text.toString().toDoubleOrNull()
            val number2 = secondNumber.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val result = number1 + number2
                resultTextView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        subtractButton.setOnClickListener {
            val number1 = firstNumber.text.toString().toDoubleOrNull()
            val number2 = secondNumber.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val result = number1 - number2
                resultTextView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        multiplyButton.setOnClickListener {
            val number1 = firstNumber.text.toString().toDoubleOrNull()
            val number2 = secondNumber.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                val result = number1 * number2
                resultTextView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        divideButton.setOnClickListener {
            val number1 = firstNumber.text.toString().toDoubleOrNull()
            val number2 = secondNumber.text.toString().toDoubleOrNull()
            if (number1 != null && number2 != null) {
                if (number2 == 0.0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                } else {
                    val result = number1 / number2
                    resultTextView.text = "Result: $result"
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }


        }
    }
}

