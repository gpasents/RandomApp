package com.example.randomapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (true){
            val intent = Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }else{
            setContentView(R.layout.test_activity)
        }


//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            val intent = Intent(this,CalculatorActivity::class.java)
//            startActivity(intent)
//        }

    }
}