package com.sl.myrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sl.myrecipes.adapter.MainCategoryAdapter
import com.sl.myrecipes.adapter.SubCategoryAdapter
import com.sl.myrecipes.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //temporary Data
        arrMainCategory.add(Recipes(id = 1, dishNAme ="Beef"))
        arrMainCategory.add(Recipes(id = 2, dishNAme ="Chicken"))
        arrMainCategory.add(Recipes(id = 3, dishNAme ="Dessert"))
        arrMainCategory.add(Recipes(id = 4, dishNAme ="Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)
        //temporary Data
        arrSubCategory.add(Recipes(id = 1, dishNAme ="Beef and Mustard Pie"))
        arrSubCategory.add(Recipes(id = 2, dishNAme = "Chicken and Mushroom Hotpot"))
        arrSubCategory.add(Recipes(id = 3, dishNAme ="Banana Pancakes"))
        arrSubCategory.add(Recipes(id = 4, dishNAme ="kapsalon"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter = subCategoryAdapter

    }
}