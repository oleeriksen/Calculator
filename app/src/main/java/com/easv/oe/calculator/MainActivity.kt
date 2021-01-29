package com.easv.oe.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.easv.oe.calculator.logic.CalculatorLogicImplLong

class MainActivity : AppCompatActivity() {

    val TAG = "cal01"

    var tvResult: TextView? = null;

    val m_calLogic = CalculatorLogicImplLong()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val etP1 = findViewById<EditText>(R.id.etP1)
        //val etP2 = findViewById<EditText>(R.id.etP2)
        //val btnAdd = findViewById<Button>(R.id.btnAdd)
        tvResult = findViewById<TextView>(R.id.tvResult)
        //btnAdd.setOnClickListener {v -> onClickAdd( v )}
    }

    fun onClickAdd( v: View) {
        Toast.makeText(this, "onClickAdd called", Toast.LENGTH_LONG).show()
        Log.d(TAG, "OnClickAdd called")
        val res = m_calLogic.add(findViewById<EditText>(R.id.etP1).text.toString(), findViewById<EditText>(R.id.etP2).text.toString())
        tvResult?.setText("$res")
    }
}
