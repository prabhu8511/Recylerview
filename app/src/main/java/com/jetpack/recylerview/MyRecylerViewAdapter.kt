package com.jetpack.recylerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MyRecylerViewAdapter(private val fruitList: List<Fruit>, private val clickListener: (Fruit) -> Unit): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
       val view = layoutInflater.inflate(R.layout.list_item,parent,false);
       return MyViewHolder(view)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      holder.bind(fruitList[position], clickListener)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}

class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
    fun bind(fruit: Fruit, clickListener: (Fruit) -> Unit){
        itemView.tvRowItem.text = fruit.name
        itemView.setOnClickListener {
            clickListener(fruit)
        }

}}