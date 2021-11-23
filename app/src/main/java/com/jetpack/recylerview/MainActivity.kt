package com.jetpack.recylerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val fruitList = listOf(Fruit("Mango","Supplier1"), Fruit("Banana","Supplier2"), Fruit("Apple","Supplier3"), Fruit("Orange","Supplier4"), Fruit("Pear","Supplier5"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_recycler_view.setBackgroundColor(Color.TRANSPARENT)
        my_recycler_view.layoutManager = LinearLayoutManager(this)
        my_recycler_view.adapter = MyRecylerViewAdapter(fruitList) { selectedItem:Fruit ->
            listItemClick(
                selectedItem
            )
        }
    }

    private fun listItemClick(fruit:Fruit){
        Toast.makeText(this,"Supplier name is ${fruit.supplier}",Toast.LENGTH_LONG).show()
    }
}