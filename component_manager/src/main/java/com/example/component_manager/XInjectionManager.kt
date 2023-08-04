package com.example.component_manager

import android.app.Application

object XInjectionManager {
    @JvmStatic
    val instance = InjectionManager(LifecycleListenerImpl())

    @JvmStatic
    fun init(app: Application) = instance.init(app)

    @JvmStatic
    fun <T> bindComponent(owner: IHasComponent<T>): T =
        instance.bindComponent(owner)

    @JvmStatic
    inline fun <reified T> findComponent(): T =
        instance.findComponent()

    @JvmStatic
    inline fun <reified T> findComponentOrNull(): T? =
        instance.findComponentOrNull()

    @JvmStatic
    fun findComponent(predicate: (Any) -> Boolean): Any =
        instance.findComponent(predicate)

    @JvmStatic
    fun findComponentOrNull(predicate: (Any) -> Boolean): Any? =
        instance.findComponentOrNull(predicate)
}