package com.example.calc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var result: EditText
    private lateinit var newNumber: EditText
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE ){
        findViewById<TextView>(R.id.textView)
    }

    private val operand1: Double? = null
    private val operand2: Double = 0.0
    private val pendingOperation = "="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.textView)
        newNumber = findViewById(R.id.editText)

        val button0: Button = findViewById(R.id.button10)
        val button1: Button = findViewById(R.id.Buttom_1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val button00: Button = findViewById(R.id.button20)
        val button_Dot: Button = findViewById(R.id.button11)
        val button_plus: Button = findViewById(R.id.button21)
        val button_minus: Button = findViewById(R.id.button15)
        val button_percent: Button = findViewById(R.id.button18)
        val button_multiply: Button = findViewById(R.id.button14)
        val button_equal: Button = findViewById(R.id.button17)
        val button_clear: Button = findViewById(R.id.button16)
        val button_back: Button = findViewById(R.id.button19)
        val button_divide: Button = findViewById(R.id.button13)




    }
}
