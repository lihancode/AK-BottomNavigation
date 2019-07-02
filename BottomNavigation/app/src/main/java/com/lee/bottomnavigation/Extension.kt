package com.lee.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    supportFragmentManager
        .beginTransaction()
        .replace(R.id.frameContainer,fragment)
        .commit()

}