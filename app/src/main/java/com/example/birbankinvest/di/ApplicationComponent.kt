package com.example.birbankinvest.di

import com.example.birbankinvest.Application
import dagger.Component

@Component
interface ApplicationComponent {

    fun inject(application: Application)

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