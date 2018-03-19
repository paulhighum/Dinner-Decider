package com.example.paulmhighum.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf<String>("Chinese", "Hamburgers", "Pizza", "McDonalds", "Barrows")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedFoodtxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener {
            foodList.add(addFoodText.text.toString())
            addFoodText.text.clear()
            println(foodList)
        }
    }
}
