package com.vr.motionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun motion1Clicked(v:View){
        startActivity(Intent(this, Motion1Activity::class.java))
    }

    fun motion2Clicked(v:View){
        startActivity(Intent(this, Motion2Activity::class.java))
    }

    fun motion3Clicked(v:View){
        startActivity(Intent(this, Motion3Activity::class.java))
    }

    fun motion4Clicked(v:View){
        startActivity(Intent(this, Motion4Activity::class.java))
    }

    fun motion5Clicked(v:View){
        startActivity(Intent(this, MotionScrollingActivity::class.java))
    }

    fun motion6Clicked(v:View){
        startActivity(Intent(this, MotionDrawerActivity::class.java))
    }

    fun motion7Clicked(v:View){
        startActivity(Intent(this, ParallexMotionActivity::class.java))
    }
}
