package com.example.authorization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birbankinvest.authorization.R
import com.example.component_manager.IHasComponent
import com.example.component_manager.XInjectionManager
import com.example.core_module.IDog
import javax.inject.Inject

class AuthorizationActivity : AppCompatActivity(), IHasComponent<AuthorizationComponent> {

    @Inject
    lateinit var dog: IDog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
    }

    override fun getComponent(): AuthorizationComponent {
        return AuthorizationComponent.Initializer.init()
    }
}