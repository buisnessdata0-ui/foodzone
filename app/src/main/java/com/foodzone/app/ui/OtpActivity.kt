package com.foodzone.app.ui
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodzone.app.databinding.ActivityOtpBinding

class OtpActivity:AppCompatActivity(){
 lateinit var b:ActivityOtpBinding
 override fun onCreate(s:Bundle?){super.onCreate(s)
  b=ActivityOtpBinding.inflate(layoutInflater);setContentView(b.root)
  b.btnVerify.setOnClickListener{ startActivity(Intent(this,HomeActivity::class.java)) }
 }
}