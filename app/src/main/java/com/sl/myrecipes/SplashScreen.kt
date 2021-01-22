package com.sl.myrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


    }

    fun goToRecipe(view: View) {
        Toast.makeText(this@SplashScreen,R.string.word, Toast.LENGTH_LONG).show()
        val intent = Intent(this@SplashScreen,RecipeInfo::class.java)
        startActivity(intent)
    }
}
