package com.example.component_manager

import android.app.Application
import com.example.component_manager.callbacks.ILifecycleListener
import com.example.component_manager.callbacks.IRemoveComponentCallback

internal class LifecycleListenerImpl : ILifecycleListener {
    override fun addLifecycleListener(app: Application, removeCallback: IRemoveComponentCallback) {
        app.registerActivityLifecycleCallbacks(ActivityLifecycleHelper(removeCallback))
    }
}