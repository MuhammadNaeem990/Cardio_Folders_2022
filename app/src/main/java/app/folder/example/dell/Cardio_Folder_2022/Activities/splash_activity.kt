package app.folder.example.dell.Cardio_Folder_2022.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.WindowManager
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Speciality.Spc_A_Activity

class splash_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
*/window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        //This method is used so that your splash activity
        //can cover the entire screen.
        setContentView(R.layout.activity_splash_activity)
        Handler().postDelayed({
            val i = Intent(this@splash_activity, LoginActivity::class.java)
            //Intent is used to switch from one activity to another.
            startActivity(i)
            //invoke the SecondActivity.
            finish()
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT.toLong())
        try {
            val videoHolder = VideoView(this)
            setContentView(videoHolder)
            val video = Uri.parse("android.resource://" + packageName + "/" + R.raw.bosch_video)
            videoHolder.setVideoURI(video)
            videoHolder.setOnCompletionListener { jump() }
            videoHolder.start()
        } catch (ex: Exception) {
            jump()
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        jump()
        return true
    }

    private fun jump() {
        if (isFinishing) return
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    companion object {
        private const val SPLASH_SCREEN_TIME_OUT = 2500
    }
}