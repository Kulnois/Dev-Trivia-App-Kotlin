package com.kulnois.triviadev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.kulnois.triviadev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var drawableLayout: DrawerLayout
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        drawableLayout = binding.drawerLayout
        navController = this.findNavController(R.id.triviaNavHostFragment)

        NavigationUI.setupActionBarWithNavController(this, navController, drawableLayout)

        navController.addOnDestinationChangedListener { navController: NavController, navDestination: NavDestination, _: Bundle? ->
            if (navDestination.id == navController.graph.startDestination) {
                drawableLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            } else {
                drawableLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }
        }
        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawableLayout)
    }
}