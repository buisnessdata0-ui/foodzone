package com.foodzone.app.ui
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.foodzone.app.databinding.ActivityHomeBinding

data class Cat(val name:String)

class HomeActivity:AppCompatActivity(){
 lateinit var b:ActivityHomeBinding
 override fun onCreate(s:Bundle?){super.onCreate(s)
  b=ActivityHomeBinding.inflate(layoutInflater);setContentView(b.root)
  val cats=listOf("Food","Grocery","Meat","Fish","Fruits","Eggs").map{Cat(it)}
  b.rvCat.layoutManager=LinearLayoutManager(this)
  b.rvCat.adapter=CatAdapter(cats){ startActivity(Intent(this,ProductListActivity::class.java)) }
  b.btnCart.setOnClickListener{ startActivity(Intent(this,CartActivity::class.java)) }
 }
}