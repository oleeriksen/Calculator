package com.easv.oe.calculator.logic

class CalculatorLogicImplLong : ICalculatorLogic {

    override fun add( s1: String, s2: String): String {
        if (!validate(s1) ||!validate(s2))
            throw IllegalArgumentException()
        var str1 = s1
        var str2 = s2
        while (str1.length < str2.length)
            str1 = "0" + str1
        while (str2.length < str1.length)
            str2 = "0" + str2

        var res = ""
        var mente = 0
        for (i in str1.length -1 downTo 0)
        {
            val c1 = str1[i]
            val c2 = str2[i]
            val c = Integer.parseInt(c1.toString()) + Integer.parseInt(c2.toString()) + mente
            res = (c % 10).toString() + res
            mente = c / 10
        }
        if (mente > 0)
            res = mente.toString() + res
        return res
    }

    public fun validate(s: String): Boolean {
        s.forEach { ch -> if ( !ch.isDigit()) return false }
        return true
    }
}