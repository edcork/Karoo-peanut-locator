package com.example.karoo.customfield

import android.util.Log
import io.hammerhead.karooext.extension.KarooExtension

class PeanutExtensionService : KarooExtension("peanut_locator", "1.0") {
    override fun onCreate() {
        super.onCreate()
        Log.d("PeanutLocator", "Extension Service Started")
    }
}