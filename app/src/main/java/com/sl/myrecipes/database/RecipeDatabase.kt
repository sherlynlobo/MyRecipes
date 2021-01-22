package com.sl.myrecipes.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sl.myrecipes.dao.RecipeDao
import com.sl.myrecipes.entities.Recipies

@Database(entities = [Recipies::class],version = 1, exportSchema = false)
abstract class RecipeDatabase:RoomDatabase() {

    companion object{
        var recipiesDatabase:RecipeDatabase? = null

        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase{
            if(recipiesDatabase!=null)
            {
                recipiesDatabase = Room.databaseBuilder(context,RecipeDatabase::class.java,"recipe.db").build()
            }
            return recipiesDatabase!!
        }

    }

    abstract fun recipeDao():RecipeDao
}