package com.example.charu.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.charu.dinnerdecider.R.id.add_food_btn
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val foodlist= arrayListOf("Chinese","Burger","Pizza","Italian","Indian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decide_btn.setOnClickListener()
        {
            val random=Random()
            val foodInd=random.nextInt(foodlist.count())
            food_Type.text=foodlist[foodInd]


        }

        add_food_btn.setOnClickListener()
        {
            val new_food=add_new_text.text.toString()
            foodlist.add(new_food)
            add_new_text.text.clear()
        }



    }
}
