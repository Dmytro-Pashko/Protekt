package com.dpashko.protekt

import android.content.Context

interface Protekt {

    companion object {

        /**
         * Obtaining a singleton instance of [Protekt] interface implementation.
         */
        @JvmStatic
        fun getInstance(): Protekt = InternalProtekt.getInstance()

        /**
         * Initialize Protekt components.
         *
         * @param context Application context.
         * @return A singleton instance of [Protekt] interface implementation.
         */
        @JvmStatic
        fun initialize(context: Context): Protekt = InternalProtekt.initialize(context)
    }
}
