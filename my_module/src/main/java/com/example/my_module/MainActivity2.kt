package com.example.my_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birbankinvest.my_module.R
import com.example.component_manager.IHasComponent
import com.example.component_manager.XInjectionManager

class MainActivity2 : AppCompatActivity(), IHasComponent<MyModuleComponent> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        XInjectionManager
            .bindComponent(this)
            .inject(this)
        setContentView(R.layout.activity_main2)
    }

    override fun getComponent(): MyModuleComponent {
        return MyModuleComponent.Initializer.init()
    }
}