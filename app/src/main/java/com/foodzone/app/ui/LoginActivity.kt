package com.foodzone.app.ui
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.foodzone.app.databinding.ActivityLoginBinding

class LoginActivity:AppCompatActivity(){
 lateinit var b:ActivityLoginBinding
 override fun onCreate(s:Bundle?){super.onCreate(s)
  b=ActivityLoginBinding.inflate(layoutInflater);setContentView(b.root)
  b.btnLogin.setOnClickListener{ startActivity(Intent(this,OtpActivity::class.java)) }
 }
}