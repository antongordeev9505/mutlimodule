package com.example.component_manager.callbacks

import android.app.Application

interface ILifecycleListener {
    fun addLifecycleListener(app: Application, removeCallback: IRemoveComponentCallback)
}