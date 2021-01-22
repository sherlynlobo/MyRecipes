package com.sl.myrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun goToRecipe(view: View) {
        Toast.makeText(this@MainActivity,R.string.word, Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity,RecipeInfo::class.java)
        startActivity(intent)
    }
}
