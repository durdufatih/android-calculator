package com.fatihdurdu.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var firstNumber: Double = 0.0
    private var operation = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setAction(view: View) {

        val btnActive = view as Button

        when (btnActive.text) {
            "AC" -> {
                firstNumber = 0.0
                txt_ShowNumber.text = "0"
            }
            "+/-" -> {
                var result = txt_ShowNumber.text.toString()
                if (result.contains("-")) result.removeRange(0, 1)
                else
                    result = "-$result"

                txt_ShowNumber.text = result
            }
            "/" -> {
                operation = "/"
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                txt_ShowNumber.text = "0"

            }
            "*" -> {
                operation = "*"
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                txt_ShowNumber.text = "0"
            }
            "+" -> {
                operation = "+"
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                txt_ShowNumber.text = "0"
            }
            "-" -> {
                operation = "-"
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                txt_ShowNumber.text = "0"
            }
            "X" -> {
                operation = "X"
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                txt_ShowNumber.text = "0"
            }
            "%" -> {
                firstNumber = txt_ShowNumber.text.toString().toDouble()
                println(firstNumber)
                println(firstNumber / 100)
                txt_ShowNumber.text = (firstNumber / 100).toString()
            }
            else -> {
                if (txt_ShowNumber.text == "0")
                    txt_ShowNumber.text = ""
                txt_ShowNumber.text = txt_ShowNumber.text.toString() + btnActive.text.toString()
            }
        }

    }

    fun setEquals(view: View) {
        when (operation) {
            "/" -> {
                txt_ShowNumber.text =
                    (firstNumber / txt_ShowNumber.text.toString().toDouble()).toString()
            }
            "X" -> {
                txt_ShowNumber.text =
                    (firstNumber * txt_ShowNumber.text.toString().toDouble()).toString()
            }
            "-" -> {
                txt_ShowNumber.text =
                    (firstNumber - txt_ShowNumber.text.toString().toDouble()).toString()
            }
            "+" -> {
                txt_ShowNumber.text =
                    (firstNumber + txt_ShowNumber.text.toString().toDouble()).toString()
            }

        }

    }
}