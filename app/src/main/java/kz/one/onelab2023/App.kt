package kz.one.onelab2023

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        println("App")
    }
}