# This is a Project of Coffee shop app
- This app 


# What It Uses
- com.github.bumptech.glide:glide:5.0.5 : This is some sort of image and media loading library. "https://github.com/bumptech/glide"


# What new I learn't
- Adding this line 
buildFeatures{
    viewBinding=true
}
Help in coding the views based logic easier.

# Procedure
- First add the build Features and enable viewBinding=true
- Add colors as follows:
- Then we imported Icon and Backgrounds.
- Connecting the project to FireBase. So go to tool in the menu and select firebase from the DropBox.
    - Next Click on Realtime Database and Connect to FireBase and then give it a name and connect it to android studio.
    - Go and add sdk the next option in the android studio and accept it
    - Go to real time database 
            - in rules make .read=true
            - then in data tab import data.json file( please wait i need to do a bit understand from my side on that)
    - Then use cloudinary.com and make a folder and upload you pictures and save it and use the links on the picture and edit the link data tab.
- Then create a New Empty Activity and name it as "SplashActivity" in the com.hanoch.coffe_shop
- Then we added a image view in the splashsactivity.xml and thenimported the splah image and the made a background. 
- Added the text box and changed it's naming and style. Then we added A button and we added a drawable xml file and entered a code to make a drawable xml file.
- Then included the drawable xml file as backgroudn and adujested the button attributes to look good.

- Then We added these lines one for making the splshacvitivyt
        private lateinit var binding: ActivitySplashBinding

        later this 
         binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        then i think this is for action to perfrom after clicking on the button.
        binding.startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

- then in manifest we changed a intent liness from the activity main and put iit in the slpahactivity
<intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
- Till here i forgot to remove a few lines at the end which stop switching of the app splash activity to another mainactivity.
       setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
# Next is Dash Board activity UI
- In the dash board at top we create a Search Bar and settings button. so we edited the make it look good.
- We added another liner horizontal layout for the search bar and the settings icon which needs to placed horizontally side by side.
- We used drawable xml to create objects which acts background and make corner and in this example we made it by making it for bell icon and setting icon background and also for search bar another brawable file.
- Intersting the bell icon and the settings icon are not buttons but image view.
- Next we added the Constraint Layout below the linear horizontal layout and inside the liner vertical layout parent.
- We added a image view and adjusted its size and scale.
- We create a Progress bar in the center and made another text view in the linear vertical layout parent.
- Added Text and change its attributes
- Another Contraint layout is added below in the linear vertical layout parent.
- Then we added a recyclerView to make a list of items.
- We make another linear horizontal layout in the parent vertical layout.
- Then we added a text view "Popular coffee".
- Then we made a nestScrollView from normal scroll view.
- Then we made a bottom navigation bar using coordinate layout and inside we used a naviagtion layout and then a linear horizontal and then linear vertical for all the icons and their names and made multiple coppies and changed the name of the images and there text.

# Banner in Dash Board
- So we a added a banner picture into our firebase cloud and to reterive it we need to call the file from the firebase into our app attribute.
- So how to do it?
    - We create a new packages name Activity( MainActivity.kt,SplashActivity.kt), Domain( BannerModel.kt) , Repository( MainRepository.kt), ViewModel(MainModelView.kt)
    inside the com.hanoch.coffe_shop
- I will try to explain the code in to .kt files.
