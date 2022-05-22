package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Homework01_calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework01_calculator)

        var input1 : String = ""
        var input2 : String = ""
        var result : String = ""
        var operator : String = ""

        var textViewResult : TextView = findViewById(R.id.calResult)
        val buttonPlus : ConstraintLayout = findViewById(R.id.plus_button)
        val buttonOne: ConstraintLayout = findViewById(R.id.num1)
        val buttonTwo : ConstraintLayout = findViewById(R.id.num2)
        val buttonThree : ConstraintLayout = findViewById(R.id.num3)
        val buttonFour : ConstraintLayout = findViewById(R.id.num4)
        val buttonFive : ConstraintLayout = findViewById(R.id.num5)
        val buttonSix : ConstraintLayout = findViewById(R.id.num6)
        val buttonSeven : ConstraintLayout = findViewById(R.id.num7)
        val buttonEight : ConstraintLayout = findViewById(R.id.num8)
        val buttonNine : ConstraintLayout = findViewById(R.id.num9)
        val buttonZero : ConstraintLayout = findViewById(R.id.num0)
        val buttonCancel : ConstraintLayout = findViewById(R.id.cancel_button)
        val buttonEqual : TextView = findViewById(R.id.equal_button)

        buttonOne.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"1")
            }else {
                input2 = setInput(input2,"1")
            }
        }
        buttonTwo.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1, "2")
            }else {
                input2 = setInput(input2, "2")
            }
        }
        buttonThree.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"3")
            }else {
                input2 = setInput(input2,"3")
            }
        }
        buttonFour.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"4")
            }else {
                input2 = setInput(input2,"4")
            }
        }
        buttonFive.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"5")
            }else {
                input2 = setInput(input2,"5")
            }
        }
        buttonSix.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"6")
            }else {
                input2 = setInput(input2,"6")
            }
        }
        buttonSeven.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"7")
            }else {
                input2 = setInput(input2,"7")
            }
        }
        buttonEight.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"8")
            }else {
                input2 = setInput(input2,"8")
            }
        }
        buttonNine.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"9")
            }else {
                input2 = setInput(input2,"9")
            }
        }
        buttonZero.setOnClickListener{
            if(operator=="") {
                input1 = setInput(input1,"0")
            }else {
                input2 = setInput(input2,"0")
            }
        }
        buttonCancel.setOnClickListener{
            input1 = ""
            input2 = ""
            operator = ""
            result = ""
            textViewResult.text=""
        }
        buttonPlus.setOnClickListener{
            if(result!=""){
                input1 = result
                result = ""
            }
            operator = "+"
        }
        buttonEqual.setOnClickListener {
            when (operator) {
                "+" -> result = (input1.toInt() + input2.toInt()).toString()
                "-" -> result = (input1.toInt() - input2.toInt()).toString()
                "/" -> result = (input1.toInt() / input2.toInt()).toString()
                "*" -> result = (input1.toInt() * input2.toInt()).toString()
            }
            textViewResult.text = result
            input1 = ""
            operator = ""
            input2 = ""
        }

    }

    fun setInput(input:String, plus:String) :String{
        var textViewResult : TextView = findViewById(R.id.calResult)
        if(plus=="0" && input == ""){
            textViewResult.text = ""
            return ""
        }else {
            textViewResult.text = input + plus
            return input + plus
        }
    }
}