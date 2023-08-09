package com.example.my_module

import android.app.Activity
import android.content.Intent
import com.example.my_module_api.MyModuleMediator
import javax.inject.Inject

class MyModuleMediatorImpl @Inject constructor(): MyModuleMediator {

    override fun navigateToMyFeature(activity: Activity) {
        val intent = Intent(activity, MainActivity2::class.java)
        activity.startActivity(intent)
    }
}