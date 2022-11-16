package app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import app.folder.example.dell.Cardio_Folder_2022.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = intent.getStringExtra("param")
    }
}