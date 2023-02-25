package com.nrup.basicsofunittesting

import android.content.Context

class ResourceCompare {

    fun isEqual(context: Context, resId: Int, myString: String): Boolean {
        return context.getString(resId) == myString
    }
}