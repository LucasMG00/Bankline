package com.app.bankline.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.app.bankline.R
import java.util.*
import kotlin.concurrent.schedule

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_welcome)
        Timer("SettingUp", false).schedule(2000) {
           val intent = Intent(this@WelcomeActivity,HomeActivity::class.java)
            startActivity(intent)
        }
    }
}