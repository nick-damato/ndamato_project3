package com.example.project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    // functions that output the number to the Equation string

    fun one (view: View)
    {
        Equation.append("1")
    }

    fun two (view: View)
    {
        Equation.append("2")
    }

    fun three (view: View)
    {
        Equation.append("3")
    }

    fun four (view: View)
    {
        Equation.append("4")
    }

    fun five (view: View)
    {
        Equation.append("5")
    }

    fun six (view: View)
    {
        Equation.append("6")
    }

    fun seven (view: View)
    {
        Equation.append("7")
    }

    fun eight (view: View)
    {
        Equation.append("8")
    }

    fun nine (view: View)
    {
        Equation.append("9")
    }

    fun zero (view: View)
    {
        Equation.append("0")
    }

    fun decimal (view: View)
    {
        Equation.append(".")
    }

    // functions that output the operations to the Equation string

    fun plu (view: View)
    {
        Equation.append("+")
    }

    fun min (view: View)
    {
        Equation.append("-")
    }

    fun multi (view: View)
    {
        Equation.append("*")
    }

    fun divide (view: View)
    {
        Equation.append("/")
    }

    fun perc (view: View)
    {
        Equation.append("%")
    }

    fun AC (view: View)
    {
        Equation.text = ""
        Sum.text = ""
    }

    fun posneg (view: View)
    {
        Equation.append("-")
    }

    // function that solves the Equation string with eval

    fun equal (view: View)
    {
            val input = ExpressionBuilder(Equation.text.toString()).build()
            val output = input.evaluate()
            Sum.text = output.toString()

    }
}
