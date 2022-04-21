package com.dpashko.protekt

import android.content.Context
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Holder and initializer of the protekt components.
 */
object ProtektComponentHolder {

    internal lateinit var protekt: Protekt

    private val isAlreadyInitialized = AtomicBoolean(false)

    /**
     * Initialize the Protekt components.
     * @param context Application context.
     */
    fun initialize(context: Context) {
        synchronized(this) {
            if (isAlreadyInitialized.compareAndSet(false, true)) {
                protekt = InternalProtekt()
            }
        }
    }
}
