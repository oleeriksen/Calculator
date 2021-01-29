package com.easv.oe.calculator

import com.easv.oe.calculator.logic.CalculatorLogicImplLong
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testCalculatorImplLongValidate() {
        val c = CalculatorLogicImplLong()
        assertTrue(c.validate("123456785"))
        assertFalse(c.validate("12a123"))
        assertFalse(c.validate("12 12"))
    }

    @Test
    fun testCalculatorImplLongAdd() {
        val c = CalculatorLogicImplLong()
        assertEquals("25", c.add("12", "13"))
        assertEquals("125", c.add("112", "13"))
        assertEquals("100", c.add("50", "50"))
        assertEquals("105", c.add("99", "6"))
        assertEquals("105", c.add("99", "6"))


    }
}
