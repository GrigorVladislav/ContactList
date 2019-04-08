package com.example.contactlist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.layout_raw.*
import kotlinx.android.synthetic.main.layout_raw.view.*

class DetailActivity : AppCompatActivity() {

    var imageId:Int = 0
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if (intent != null) {

            var id = intent.getStringExtra("id")
            val repo = ContactListRepository
            var user = repo.getUserById(id)
            if (user != null) {
                imageId = user.imageId
            name_view_detail.text = user.name
            second_name_view.text=user.secondName
            phone_number_view.text=user.phoneNumber
            email_view.text=user.email
                detailImage.setImageResource(user.imageId)
            }
        }
            detailImage.setOnClickListener(object : View.OnClickListener{
                override fun onClick(v: View?) {

                    goToThridScreen(imageId)

                }
            })

    }
    fun goToThridScreen(id:Int){
        val intent= Intent(this,ThridScreen::class.java)
        intent.putExtra("id",id)
        this.startActivity(intent)
    }

}
