package com.example.authorization

import android.app.Activity
import android.content.Intent
import com.example.authorization_api.AuthorizationMediator
import javax.inject.Inject

class AuthorizationMediatorImpl @Inject constructor(): AuthorizationMediator {

    override fun navigateToFeature(activity: Activity) {
        val intent = Intent(activity, AuthorizationActivity::class.java)
        activity.startActivity(intent)
    }
}