package net.geeksforgeeks.pushnotificationsinkotlin

import android.util.Log
import android.widget.Toast
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class FirebaseInstanceIdService : FirebaseInstanceIdService() {

    lateinit var name: String

    override fun onTokenRefresh() {
        val token = FirebaseInstanceId.getInstance().token
        Log.e("PushNotification", "Token : ${token}")

    }

}