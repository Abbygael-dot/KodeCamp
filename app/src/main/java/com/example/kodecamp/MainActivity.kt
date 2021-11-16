package com.example.kodecamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kodecamp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(R.layout.activity_main) {
//    private var binding : ActivityMainBinding? = null
//
    private lateinit var navcon : NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
////        setContentView(binding.root)
        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navcon = navHost.navController

       setupActionBarWithNavController(navcon)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navcon.navigateUp() || super.onSupportNavigateUp()
    }

}