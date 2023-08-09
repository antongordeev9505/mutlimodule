package com.example.my_module

import android.app.Activity
import android.content.Intent
import com.example.my_module_api.MyModuleMediator

class MyModuleMediatorImpl : MyModuleMediator {

    override fun navigateToMyModule(activity: Activity) {
        val intent = Intent(activity, MainActivity2::class.java)
        activity.startActivity(intent)
    }
}