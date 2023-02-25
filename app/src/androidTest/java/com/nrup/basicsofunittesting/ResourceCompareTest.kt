package com.nrup.basicsofunittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

//https://www.youtube.com/watch?v=PsoLeJOh30o

class ResourceCompareTest {

    private var resourceCompare = ResourceCompare()

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