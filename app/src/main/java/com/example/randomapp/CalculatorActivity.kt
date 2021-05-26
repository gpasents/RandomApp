package com.example.randomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        var add:Boolean = false
        var sub:Boolean= false
        var mult:Boolean= false
        var div:Boolean= false
        var resultFlag:Boolean= false
        var firstNumber: Float = 0F
        var secondNumber:Float = 0F
        var result:Float
        val text = findViewById<TextView>(R.id.editTextTextPersonName2)

        val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonDot = findViewById<Button>(R.id.buttonDot)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSub = findViewById<Button>(R.id.buttonSub)
        val buttonMult = findViewById<Button>(R.id.buttonMult)
        val buttonDiv = findViewById<Button>(R.id.buttonDiv)
        val buttonEqu = findViewById<Button>(R.id.buttonEqu)

        fun buttonClick(number:String){
            if (resultFlag){
                text.setText(number)
                resultFlag=false
            }else{
                text.text = text.text.toString() + number
                //text.setText(text.text.toString() + number)
            }
        }

        button0.setOnClickListener {
            buttonClick("0")
        }
        button1.setOnClickListener {
            buttonClick("1")
        }
        button2.setOnClickListener {
            buttonClick("2")
        }
        button3.setOnClickListener {
            buttonClick("3")
        }
        button4.setOnClickListener {
            buttonClick("4")
        }
        button5.setOnClickListener {
            buttonClick("5")
        }
        button6.setOnClickListener {
            buttonClick("6")
        }
        button7.setOnClickListener {
            buttonClick("7")
        }
        button8.setOnClickListener {
            buttonClick("8")
        }
        button9.setOnClickListener {
            buttonClick("9")
        }
        buttonDot.setOnClickListener {
            buttonClick(".")
        }
        buttonC.setOnClickListener {
            text.setText("")
        }





        buttonAdd.setOnClickListener {
            if (text.text.toString() == ""){
                text.setText("")
            }
            else{
                firstNumber = text.text.toString().toFloat()
                add = true
                sub = false
                div = false
                mult =false
                text.setText(null)
            }

        }

        buttonSub.setOnClickListener {
            if (text.text.toString() == "" ){
                text.setText("")
            }
            else{
                firstNumber = text.text.toString().toFloat()
                add = false
                sub = true
                div = false
                mult =false
                text.setText(null)
            }

        }
        buttonDiv.setOnClickListener {
            if (text.text.toString() == "" ){
                text.setText("")
            }
            else{
                firstNumber = text.text.toString().toFloat()
                add = false
                sub = false
                div = true
                mult =false
                text.setText(null)
            }

        }
        buttonMult.setOnClickListener {
            if (text.text.toString() == "" ){
                text.setText("")
            }
            else{
                firstNumber = text.text.toString().toFloat()
                add = false
                sub = false
                div = false
                mult =true
                text.setText(null)
            }

        }

        buttonEqu.setOnClickListener {
            var stringNumber = text.text.toString()

            if (stringNumber=="")
            else{
                if (add) {
                    secondNumber = text.text.toString().toFloat()

                    result = firstNumber + secondNumber

                    text.setText(result.toString())

                }else if (sub){
                    secondNumber = text.text.toString().toFloat()

                    result = firstNumber - secondNumber

                    text.setText(result.toString())
                }else if (div){
                    secondNumber = text.text.toString().toFloat()
                    if(secondNumber != 0F){
                        result = firstNumber / secondNumber
                        text.setText(result.toString())
                    }else
                    {
                        text.setText("Never divide by 0")
                    }


                }else{
                    secondNumber = text.text.toString().toFloat()

                    result = firstNumber * secondNumber

                    text.setText(result.toString())
                }
                firstNumber = 0F
                secondNumber = 0F
                add = false
                sub = false
                div = false
                mult =false
                resultFlag = true
            }


        }







    }
}