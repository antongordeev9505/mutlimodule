package com.example.birbankinvest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.birbankinvest.di.ApplicationComponent
import com.example.component_manager.XInjectionManager
import com.example.core_module.IDog
import com.example.my_module_api.MyModuleMediator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mediator: MyModuleMediator

    @Inject
    lateinit var dog: IDog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        XInjectionManager
            .findComponent<ApplicationComponent>()
            .inject(this)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            mediator.navigateToMyFeature(this)
        }
    }
}