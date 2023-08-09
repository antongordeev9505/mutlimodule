package com.example.birbankinvest.di

import com.example.authorization.AuthorizationDeps
import com.example.my_module.MyModuleDeps

interface AppDeps :
    MyModuleDeps,
    AuthorizationDeps