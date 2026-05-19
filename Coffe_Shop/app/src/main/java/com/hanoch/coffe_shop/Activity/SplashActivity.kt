package com.hanoch.coffe_shop.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.hanoch.coffe_shop.databinding.ActivityMainBinding
import com.hanoch.coffe_shop.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    /*ViewBinding is a method which we use which better than FindbyID
    * So we can easily Access the Object in our layout file and control it in this code kotlin
    * And make operation like button,input,output etc.
    * */
    private lateinit var binding: ActivitySplashBinding // This line defines link/binding as the activity_splash.xml

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // This display the App in full Screen like the status bar and navigation bar gest filled with app contents
        binding = ActivitySplashBinding.inflate(layoutInflater) // inflate read the .xml file and creates kotlin/java objects during runtime. and it does by passing the read data to Layout inflator to create. This is a android OS tools to make objects from the xml
        setContentView(binding.root) // The root is automatically set as the first layout of the xml file. And then it call the OS to render it which is alreay prepared in the background by the inflator.

        binding.startBtn.setOnClickListener { // We have give startBtn id for the button in splash screen, and we are keeping a click detector.
        // Then startActivity send a signal using the Intent which calls the Next Activity class and xml and also sends "this" which contains the current calling class or activity information.
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}