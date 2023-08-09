package com.example.core_module

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DependencyModule {

    @Provides
    fun provideDog(): IDog {
        return Dog("Dog")
    }
}

class Dog @Inject constructor(val name: String): IDog

interface IDog