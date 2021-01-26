package com.sl.myrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    btnGetStarted.setOnClickListener{
        var intent = Intent(this@SplashScreen,HomeActivity::class.java)
        startActivity(intent)
        finish()
        }
    }


}
