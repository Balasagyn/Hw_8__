package com.example.hw_8__

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager
                .findFragmentById(androidx.navigation.fragment.
                R.id.nav_host_fragment_container
                ) as NavHostFragment


        val navController =
            navHostFragment.navController
    }

    override fun onBackPressed() {
        finish()
    }


}