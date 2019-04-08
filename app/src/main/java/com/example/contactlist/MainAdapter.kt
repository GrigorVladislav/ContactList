package com.example.contactlist

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_raw.view.*

class MainAdapter:RecyclerView.Adapter<CustomViewHolder>() {

    val repo = ContactListRepository
    val list = repo.initList()

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.layout_raw,parent,false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
       val user = list.get(position)
    holder.view.name_view.text = user.name
        holder.view.number_view.text=user.phoneNumber
        holder.view.Photo.setImageResource(user.imageId)
        holder.ClickItem(user.id)
    }


}

class CustomViewHolder(val view:View): RecyclerView.ViewHolder(view){


fun ClickItem ( id:String){
    view.setOnClickListener{
        val inten = Intent(view.context,DetailActivity::class.java)
        inten.putExtra("id", id)
        view.context.startActivity(inten)
    }
}

}