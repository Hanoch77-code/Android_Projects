package com.hanoch.coffe_shop.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.hanoch.coffe_shop.Domain.BannerModel
import com.hanoch.coffe_shop.Domain.CategoryModel

class MainRepository {
    private val firebaseDatabase = FirebaseDatabase.getInstance() // Connects to firebase database cloud instance


    fun loadBanner(): LiveData<MutableList<BannerModel>>
    {
        val listData = MutableLiveData<MutableList<BannerModel>>()
        val ref = firebaseDatabase.getReference("Banner") // Searches for Banner in the JSON tree we specfiied in the fireBase.
        ref.addValueEventListener(object : ValueEventListener{ //  This listens for changes and updates data from the Firebase cloud when we change the data in the firebase console
            override fun onDataChange(snapshot: DataSnapshot) { //
                val list = mutableListOf<BannerModel>()
                for(childSnapshot in snapshot.children){ // loops through every individual banner object in the Banner node
                    val item=childSnapshot.getValue(BannerModel::class.java)  // stores data into the BannerModel object
                    item?.let {list.add(it)} // Safety check ignore corrupt or empty database.
                }
                listData.value=list // sends the dta to the mutablelivedata to et instantly refreshed.
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        return listData // return the data back to the MainModelView
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>>
    {
        val listData = MutableLiveData<MutableList<CategoryModel>>()
        val ref = firebaseDatabase.getReference("Category") // Searches for Banner in the JSON tree we specfiied in the fireBase.
        ref.addValueEventListener(object : ValueEventListener{ //  This listens for changes and updates data from the Firebase cloud when we change the data in the firebase console
            override fun onDataChange(snapshot: DataSnapshot) { //
                val list = mutableListOf<BannerModel>()
                for(childSnapshot in snapshot.children){ // loops through every individual banner object in the Banner node
                    val item=childSnapshot.getValue(CategoryModel::class.java)  // stores data into the BannerModel object
                    item?.let {list.add(it)} // Safety check ignore corrupt or empty database.
                }
                listData.value=list // sends the dta to the mutablelivedata to et instantly refreshed.
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        return listData // return the data back to the MainModelView
    }
}