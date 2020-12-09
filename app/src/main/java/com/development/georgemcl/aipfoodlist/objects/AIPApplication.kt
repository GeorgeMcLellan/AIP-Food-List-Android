package com.development.georgemcl.aipfoodlist.objects

import android.app.Application
import timber.log.Timber

class AIPApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.i("Application launched")

        Timber.plant(Timber.DebugTree())
        Timber.i("planted")
    }
}