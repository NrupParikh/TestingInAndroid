package com.nrup.basicsofunittesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before
import org.junit.Test

//https://www.youtube.com/watch?v=PsoLeJOh30o

class ResourceCompareTest {

    private lateinit var resourceCompare: ResourceCompare

    // Execute the resource before our test case(s)
    @Before
    fun setup(){
        resourceCompare = ResourceCompare()
    }

    // Execute after the test case(s). Generally to clean up the DB object.
    @After
    fun tearDown(){
        Log.d("TAG","Test cases are completed. Clean up the object(s)")
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "BasicsOfUnitTesting")
        assert(result)
    }


    @Test
    fun stringResourceSameAsGivenString_returnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "ABCD")
        assert(!result)
    }
}