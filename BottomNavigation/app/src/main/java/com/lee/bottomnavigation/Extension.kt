package com.lee.bottomnavigation

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    supportFragmentManager
        .beginTransaction()
        .replace(R.id.frameContainer,fragment)
        .commit()

}

fun Fragment.showToast(string: String){
    Toast.makeText(context,"message : $string",Toast.LENGTH_SHORT).show()
}