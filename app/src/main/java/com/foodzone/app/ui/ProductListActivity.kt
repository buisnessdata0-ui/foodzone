package com.foodzone.app.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.foodzone.app.databinding.ActivityProductsBinding

data class Product(val name:String,val price:Int)

class ProductListActivity:AppCompatActivity(){
 lateinit var b:ActivityProductsBinding
 override fun onCreate(s:Bundle?){super.onCreate(s)
  b=ActivityProductsBinding.inflate(layoutInflater);setContentView(b.root)
  val list=listOf(Product("Burger",120),Product("Pizza",250))
  b.rvProducts.layoutManager=LinearLayoutManager(this)
  b.rvProducts.adapter=ProductAdapter(list)
 }
}