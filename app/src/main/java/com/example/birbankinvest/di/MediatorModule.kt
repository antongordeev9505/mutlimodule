package com.example.birbankinvest.di

import com.example.authorization.AuthorizationMediatorImpl
import com.example.authorization_api.AuthorizationMediator
import com.example.my_module.MyModuleMediatorImpl
import com.example.my_module_api.MyModuleMediator
import dagger.Binds
import dagger.Module

@Module
interface MediatorModule {

    @Binds
    fun provideMyModuleMediator(mediator: MyModuleMediatorImpl): MyModuleMediator

    @Binds
    fun provideAuthorizationMediator(mediator: AuthorizationMediatorImpl): AuthorizationMediator
}