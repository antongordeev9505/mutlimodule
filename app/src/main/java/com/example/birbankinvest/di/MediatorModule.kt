package com.example.birbankinvest.di

import com.example.my_module.MyModuleMediatorImpl
import com.example.my_module_api.MyModuleMediator
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class MediatorModule {

    @Provides
    fun provideMediator(): MyModuleMediator {
        return MyModuleMediatorImpl()
    }

//    @Binds
//    fun provideMediator(): MyModuleMediator
}