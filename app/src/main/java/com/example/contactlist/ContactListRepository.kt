package com.example.contactlist

import android.provider.MediaStore

object ContactListRepository {
    var list = listOf<UserInfo>()

    fun initList():List<UserInfo>{

       list = listOf(
            UserInfo("0", "Mama","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image0),
            UserInfo("1", "Papa","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image1),
            UserInfo("2", "Dydya","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image2),
            UserInfo("3", "Brat","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image3),
            UserInfo("4", "Telka1","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image4),
            UserInfo("5", "Pezdyuk","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image5),
            UserInfo("6", "Zyat'","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image6),
            UserInfo("7", "Telka2","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image7),
            UserInfo("8", "Ublydok","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image8),
            UserInfo("9", "Winter is comming","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image9),
            UserInfo("10", "Papa Drakonov","Pypkin","066-123-123-11","alolalo@gogugle.com",R.drawable.image10))

        return list
    }

    fun getUserById(id:String):UserInfo?{
   for (item in list){
       if (item.id==id){
           return item
       }

        }
    return null
    }

}