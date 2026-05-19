package com.hanoch.coffe_shop.Activity

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import com.bumptech.glide.Glide
import com.hanoch.coffe_shop.R
import com.hanoch.coffe_shop.ViewModel.MainModelView
import com.hanoch.coffe_shop.databinding.ActivityMainBinding
import com.hanoch.coffe_shop.databinding.ActivitySplashBinding

class MainActivity : AppCompatActivity() {
    /*ViewBinding is a method which we use which better than FindbyID
    * So we can easily Access the Object in our layout file and control it in this code kotlin
    * And make operation like button,input,output etc.
    * */
    private lateinit var binding: ActivityMainBinding  // This line defines link/binding as the activity_main.xml
    private val viewModel= MainModelView()
/// Initiatlization of the screen using ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBanner() // Then we call initBanner function to show the banner.
    }

    private fun initBanner() {
        binding.progressBarBanner.visibility=View.VISIBLE //  at the start we search fo rht ProgressBar  and make it visible.
        viewModel.loadBanner().observeForever { //Observes for changes always and notify the UI that it has the image and update it to the screen.
            // Glide is used to display image and videos in the activity but define the proper object. For image imageView and VideoView for video.
            Glide.with(this@MainActivity) // only when on this activity.
                .load(it[0].url) // it.Url is the url from the Banner object in the JSON file.
                .into(binding.banner) // banner is our imageview id.
            binding.progressBarBanner.visibility = View.GONE //  when image is found stop displaying the progressBar or loading screen.
        }
        //viewModel.loadBanner()
    }
}