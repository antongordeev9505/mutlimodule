package com.example.authorization

import com.example.component_manager.XInjectionManager
import dagger.Component

@Component(dependencies = [AuthorizationDeps::class])
interface AuthorizationComponent {

    fun inject(activity: AuthorizationActivity)

    @Component.Factory
    interface Factory {
        fun create(deps: AuthorizationDeps): AuthorizationComponent
    }

    class Initializer private constructor() {
        companion object {
            fun init(): AuthorizationComponent = DaggerAuthorizationComponent
                .factory()
                .create(XInjectionManager.findComponent())
        }
    }
}