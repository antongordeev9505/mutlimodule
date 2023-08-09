package com.example.my_module

import com.example.authorization_api.AuthorizationMediator
import com.example.core_module.IDog

interface MyModuleDeps {

    val dog: IDog
    val mediator: AuthorizationMediator
}