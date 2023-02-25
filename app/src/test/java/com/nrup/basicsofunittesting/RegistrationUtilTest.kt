package com.nrup.basicsofunittesting

import org.junit.Test

//https://www.youtube.com/watch?v=W0ag98EDhGc

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "123",
            confirmedPassword = "123"
        )
        assert(!result)
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Amit",
            password = "123",
            confirmedPassword = "123"
        )
        assert(result)
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Vijay",
            password = "123",
            confirmedPassword = "123"
        )
        assert(!result)
    }


    @Test
    fun `incorrectly confiremed password returns flase`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Vijay",
            password = "123",
            confirmedPassword = "456"
        )
        assert(!result)
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Vijay",
            password = "",
            confirmedPassword = "123"
        )
        assert(!result)
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Vijay",
            password = "abcd2",
            confirmedPassword = "abcd2"
        )
        assert(!result)
    }

}