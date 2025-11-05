package com.foodzone.app.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodzone.app.databinding.ActivityCartBinding

class CartActivity:AppCompatActivity(){
 lateinit var b:ActivityCartBinding
 override fun onCreate(s:Bundle?){super.onCreate(s)
  b=ActivityCartBinding.inflate(layoutInflater);setContentView(b.root)
 }
}