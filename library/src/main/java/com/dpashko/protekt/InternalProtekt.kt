package com.dpashko.protekt

import android.content.Context

internal class InternalProtekt : Protekt {

    companion object {

        fun getInstance(): Protekt = ProtektComponentHolder.protekt

        fun initialize(context: Context): Protekt {
            ProtektComponentHolder.initialize(context)
            return getInstance()
        }
    }
}
