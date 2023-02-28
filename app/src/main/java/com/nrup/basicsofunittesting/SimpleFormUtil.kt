package com.nrup.basicsofunittesting

object SimpleFormUtil {

    fun validateFormInput(name: String, idNumber: Int): Boolean {
        return !(name.isEmpty() || idNumber <= 0)
    }
}