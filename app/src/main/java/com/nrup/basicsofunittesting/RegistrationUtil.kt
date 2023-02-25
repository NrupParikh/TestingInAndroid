package com.nrup.basicsofunittesting

object RegistrationUtil {

    private val existingUsers = listOf("Nrup", "Vijay")

    /**
     * input is not validate if
     * - username or password is empty
     * - username is already taken
     * - confirmedPassword is not same as real password
     * - password contains less than 2 digits
     * */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }

        if (userName in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }

        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}