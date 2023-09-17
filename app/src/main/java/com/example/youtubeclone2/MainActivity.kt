package com.example.youtubeclone2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.youtubeclone2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        // Get the original PNG image as a bitmap
        val originalBitmap: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.youtube)
        // Create a new bitmap with the desired width and height
        val resizedBitmap: Bitmap = Bitmap.createScaledBitmap(originalBitmap, 310, 134, false)
        // Create a drawable from the bitmap
        val drawableFromBitmap: BitmapDrawable = BitmapDrawable(resources, resizedBitmap)

        // Set the resized bitmap as the image source for the MaterialToolBar
        binding.mtbMain.logo = drawableFromBitmap
        // To hide the title
        supportActionBar?.setDisplayShowTitleEnabled(false)

        binding.bnvMain.setOnItemSelectedListener { item->
            when (item.itemId) {
                R.id.miHome -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.miShorts -> {
                    replaceFragment(ShortsFragment())
                    true
                }
                R.id.miSubscription -> {
                    replaceFragment(SubscriptionsFragment())
                    true
                }
                R.id.miLibrary -> {
                    replaceFragment(LibraryFragment())
                    true
                }
                R.id.miAdd -> {
                    replaceFragment(AddFragment())
                    true
                }
                else -> false
            }
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.flMain, fragment)
        fragmentTransaction.commit()
    }
}