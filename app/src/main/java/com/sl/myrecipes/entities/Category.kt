package com.sl.myrecipes.entities

import androidx.room.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.sl.myrecipes.entities.converter.CategoryListConverter

@Entity(tableName = "CategoryItems")

data class Category(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categoriesitems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categoriesitems: List<CategoryItems>? = null
)

