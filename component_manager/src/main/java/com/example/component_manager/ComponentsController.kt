package com.example.component_manager

import android.app.Application
import com.example.component_manager.callbacks.ILifecycleListener
import com.example.component_manager.callbacks.IRemoveComponentCallback

internal class ComponentsController(
    private val componentsStore: ComponentsStore,
    private val platformLifecycleCallbacks: ILifecycleListener
) : IRemoveComponentCallback {

    override fun onRemove(key: String) {
        componentsStore.remove(key)
    }

    fun addLifecycleCallbackListeners(app: Application) {
        platformLifecycleCallbacks.addLifecycleListener(app, this)
    }

    fun <T> bindComponent(owner: IHasComponent<T>) = buildOrCreateComponent(owner)

    @Suppress("UNCHECKED_CAST")
    private fun <T> buildOrCreateComponent(owner: IHasComponent<T>): T {
        with(owner.getComponentKey()) {
            if (componentsStore.isExist(this)) {
                return componentsStore.get(this) as T
            }
            return owner.getComponent().also { componentsStore.add(this, it as Any) }
        }
    }
}