package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Homework01_calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework01_calculator)

        var input1 : String = ""
        var input2 : String = ""
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
//            if(isInt(result)) {
//                result += "1"
//                textViewResult.setText(result)
//            }else {
//                result += "1"
//                textViewResult.setText("1")
//            }
        }
        buttonTwo.setOnClickListener{
            textViewResult.setText("2")
        }
        buttonThree.setOnClickListener{
            textViewResult.setText("3")
        }
        buttonFour.setOnClickListener{
            textViewResult.setText("4")
        }
        buttonFive.setOnClickListener{
            textViewResult.setText("5")
        }
        buttonSix.setOnClickListener{
            textViewResult.setText("6")
        }
        buttonSeven.setOnClickListener{
            textViewResult.setText("7")
        }
        buttonEight.setOnClickListener{
            textViewResult.setText("8")
        }
        buttonNine.setOnClickListener{
            textViewResult.setText("9")
        }
        buttonZero.setOnClickListener{
            textViewResult.setText("0")
        }
    }

    fun isInt(var1 : Any) : Boolean{
        return var1 is Int
    }
}