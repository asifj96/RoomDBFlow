package com.best.busscedularapp

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import com.best.busscedularapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val navHost: NavHostFragment by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
    }
    private val navController: NavController by lazy {
        navHost.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    private var doubleBackToExitPressedOnce = false

    override fun onBackPressed() {

        if (navController.currentDestination?.id != R.id.fullScheduleFragment
        ) {
            val navOption = NavOptions.Builder()
                .setPopUpTo(navController.currentDestination?.id!!, true).build()
            navController.navigate(R.id.fullScheduleFragment, null, navOption)
        } else {
            if (doubleBackToExitPressedOnce) {
                super.onBackPressed()
                finish()
                return
            }
            doubleBackToExitPressedOnce = true
            Handler(Looper.getMainLooper()).postDelayed({
                doubleBackToExitPressedOnce = false
            }, 2000)
        }
    }
}