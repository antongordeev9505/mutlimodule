package com.example.birbankinvest.di

import com.example.birbankinvest.Application
import com.example.birbankinvest.MainActivity
import dagger.Component

@Component(modules = [MediatorModule::class])
interface ApplicationComponent : AppDeps {

    fun inject(application: Application)
    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(): ApplicationComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): ApplicationComponent = DaggerApplicationComponent
                .factory()
                .create()
        }
    }
}