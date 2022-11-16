package app.folder.example.dell.Cardio_Folder_2022.Activities_Animated

import android.app.AlertDialog
import android.content.Intent
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import app.folder.example.dell.Cardio_Folder_2022.Main_Fragment_Animated.ProductF_Fragment_Main
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductF_Animated_Fragments.*
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductF_Activity : AppCompatActivity() {
    var FM: FragmentManager? = null
    var FT: FragmentTransaction? = null
    var locationManager: LocationManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
        setContentView(R.layout.activity_product_f_)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        //toolbar.setTitle("Product C");
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(null)
        FM = supportFragmentManager
        FT = FM?.beginTransaction()
        FT?.replace(R.id.containerView, ProductF_Fragment_Main())?.commit()
        fn_checkLocation()
    }

    private fun fn_checkLocation() {
        locationManager = applicationContext.getSystemService(LOCATION_SERVICE) as LocationManager
        isNetworkEnable = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        isGPSEnable = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (!isGPSEnable && !isNetworkEnable) {
            buildAlertMessageNoGps()

        }
    }

    private fun buildAlertMessageNoGps() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }
            .setNegativeButton("No") { dialog, id ->
                finishAffinity()
                System.exit(0)
            }
        val alert = builder.create()
        alert.show()
    }

    override fun onResume() {
        super.onResume()
        fn_checkLocation()
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.app_bar_menu_6, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.product_F_page1 -> {
                val fragmentTransaction1 = FM!!.beginTransaction()
                fragmentTransaction1.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_One()
                ).commit()
                true
            }
            R.id.product_F_page2 -> {
                val fragmentTransaction2 = FM!!.beginTransaction()
                fragmentTransaction2.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Two()
                ).commit()
                true
            }
            R.id.product_F_page3 -> {
                val fragmentTransaction3 = FM!!.beginTransaction()
                fragmentTransaction3.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Three()
                ).commit()
                true
            }
            R.id.product_F_page4 -> {
                val fragmentTransaction4 = FM!!.beginTransaction()
                fragmentTransaction4.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Four()
                ).commit()
                true
            }
            R.id.product_F_page5 -> {
                val fragmentTransaction5 = FM!!.beginTransaction()
                fragmentTransaction5.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Five()
                ).commit()
                true
            }
            R.id.product_F_page6 -> {
                val fragmentTransaction6 = FM!!.beginTransaction()
                fragmentTransaction6.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Six()
                ).commit()
                true
            }
            R.id.product_F_page7 -> {
                val fragmentTransaction7 = FM!!.beginTransaction()
                fragmentTransaction7.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Seven()
                ).commit()
                true
            }
            R.id.product_F_page8 -> {
                val fragmentTransaction8 = FM!!.beginTransaction()
                fragmentTransaction8.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Eight()
                ).commit()
                true
            }
            R.id.product_F_page9 -> {
                val fragmentTransaction9 = FM!!.beginTransaction()
                fragmentTransaction9.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Nine()
                ).commit()
                true
            }
            R.id.product_F_page10 -> {
                val fragmentTransaction11 = FM!!.beginTransaction()
                fragmentTransaction11.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Eleven()
                ).commit()
                true
            }
            R.id.product_F_page11 -> {
                val fragmentTransaction13 = FM!!.beginTransaction()
                fragmentTransaction13.replace(R.id.containerView, ProductF_Fragment_page_Thirteen())
                    .commit()
                true
            }
            R.id.product_F_page12 -> {
                val fragmentTransaction10 = FM!!.beginTransaction()
                fragmentTransaction10.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Ten()
                ).commit()
                true
            }
            R.id.product_F_page13 -> {
                val fragmentTransaction12 = FM!!.beginTransaction()
                fragmentTransaction12.replace(
                    R.id.containerView,
                    ProductF_Fragment_page_Twelve()
                ).commit()
                true
            }
            R.id.product_F_page14 -> {
                val fragmentTransaction14 = FM!!.beginTransaction()
                fragmentTransaction14.replace(R.id.containerView, ProductF_Fragment_page_Fourteen())
                    .commit()
                true
            }
            R.id.product_F_Complete -> {
                val fragmentTransaction15 = FM!!.beginTransaction()
                fragmentTransaction15.replace(R.id.containerView, ProductF_Fragment_Main()).commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}