package com.easv.oe.calculator.logic

class CalculatorLogicImpl : ICalculatorLogic {
    override fun add(s1: String, s2: String): String {
        val i1 = Integer.parseInt(s1)
        val i2 = Integer.parseInt(s2)
        val res = i1+i2
        return res.toString()
    }
}