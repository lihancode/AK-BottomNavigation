package com.lee.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener(this@MainActivity)
        //default
        replaceFragment(HomeFragment())

    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {

        return when(menuItem.itemId){
            R.id.ic_navi_home->{
                replaceFragment(HomeFragment())
                true
            }
            R.id.ic_navi_location->{
                replaceFragment(LocationFragment())
                true
            }
            R.id.ic_navi_notify->{
                replaceFragment(NotifyFragment())
                true
            }else->{
                replaceFragment(HomeFragment())
                true
            }
        }


    }

}
