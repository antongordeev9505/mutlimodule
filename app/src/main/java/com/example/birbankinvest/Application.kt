package com.example.birbankinvest

import android.app.Application
import com.example.birbankinvest.di.ApplicationComponent
import com.example.component_manager.IHasComponent
import com.example.component_manager.XInjectionManager

class Application : Application(), IHasComponent<ApplicationComponent> {

    override fun onCreate() {
        super.onCreate()
        XInjectionManager.init(this)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
    }

    override fun getComponent() = ApplicationComponent.Initializer.init()
}