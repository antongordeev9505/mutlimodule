package com.example.component_manager.callbacks

interface IRemoveComponentCallback {
    /**
     * This method notifies the store to destroy the component with the given [key].
     */
    fun onRemove(key: String)
}