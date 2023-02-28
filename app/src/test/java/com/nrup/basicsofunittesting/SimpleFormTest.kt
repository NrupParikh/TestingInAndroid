package com.nrup.basicsofunittesting

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


class SimpleFormTest {

    @Test
    fun whenInputsAreValidReturnTrue() {
        val result = SimpleFormUtil.validateFormInput(
            name = "Nrup",
            idNumber = 1232
        )
        assertTrue(result)
    }

    @Test
    fun whenInputsAreNotValidReturnFalse() {
        val result = SimpleFormUtil.validateFormInput(
            name = "",
            idNumber = 0
        )
        assertTrue(!result)
    }
}