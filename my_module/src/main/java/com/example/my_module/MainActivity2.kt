package com.example.my_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.authorization_api.AuthorizationMediator
import com.example.birbankinvest.my_module.R
import com.example.component_manager.IHasComponent
import com.example.component_manager.XInjectionManager
import com.example.core_module.IDog
import javax.inject.Inject

class MainActivity2 : AppCompatActivity(), IHasComponent<MyModuleComponent> {

    @Inject
    lateinit var mediator: AuthorizationMediator

    @Inject
    lateinit var dog: IDog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mediator.navigateToFeature(this)
        }
    }

    override fun getComponent(): MyModuleComponent {
        return MyModuleComponent.Initializer.init()
    }
}