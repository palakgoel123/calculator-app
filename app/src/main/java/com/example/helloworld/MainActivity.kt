package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldnumber=""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberevent(view: View) {
        if(isNewOp)
            editText.setText("")
        isNewOp = false
     var buclick = editText.text.toString()
     var buselect = view as Button
        when(buselect.id){
            bu1.id -> {buclick += "1"}
            bu2.id -> {buclick += "2"}
            bu3.id -> {buclick += "3"}
            bu4.id -> {buclick += "4"}
            bu5.id -> {buclick += "5"}
            bu6.id -> {buclick += "6"}
            bu7.id -> {buclick += "7"}
            bu8.id -> {buclick += "8"}
            bu9.id -> {buclick += "9"}
            bu0.id -> {buclick += "0"}
            budot.id -> {buclick += "."}

        }
        editText.setText(buclick)
    }

    fun operatorevent(view: View) {
        isNewOp=true
        oldnumber=editText.text.toString()
        var buclick = editText.text.toString()
        var buselect = view as Button
        when(buselect.id){
            budivide.id -> {op = "/"}
            bumultiply.id -> {op = "*"}
            buplus.id -> {op = "+"}
            buminus.id -> {op = "-"}
            bupower2.id -> { op= "x^2"}
        }
    }

    fun equalevent(view: View) {
        var newnumber = editText.text.toString()
        var result = 0.0
        when (op) {
            "+" -> result = oldnumber.toDouble() + newnumber.toDouble()
            "-" -> result = oldnumber.toDouble() - newnumber.toDouble()
            "*" -> result = oldnumber.toDouble() * newnumber.toDouble()
            "/" -> result = oldnumber.toDouble() / newnumber.toDouble()
            "x^2" -> result = oldnumber.toDouble() * oldnumber.toDouble()
        }
        editText.setText(result.toString())
    }

    fun ACevent(view: View) {
        editText.setText("0")
        isNewOp = true
    }

    fun percentage(view: View) {
        var no = editText.text.toString().toDouble()/100
        editText.setText(no.toString())
        isNewOp = true
    }

}
