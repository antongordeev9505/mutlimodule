package com.example.my_module

import android.content.Context
import com.example.component_manager.XInjectionManager
import dagger.Component

@Component(dependencies = [MyModuleDeps::class],
)
interface MyModuleComponent {

    fun inject(activity: MainActivity2)

    @Component.Factory
    interface Factory {
        fun create(deps: MyModuleDeps): MyModuleComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): MyModuleComponent = DaggerMyModuleComponent
                .factory()
                .create(XInjectionManager.findComponent())
        }
    }
}