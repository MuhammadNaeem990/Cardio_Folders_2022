package app.folder.example.dell.Cardio_Folder_2022.Activities_Static

import android.app.AlertDialog
import android.content.Intent
import android.location.LocationManager
import android.net.wifi.WifiManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import app.folder.example.dell.Cardio_Folder_2022.Main_Fragment_Static.ProductA_Fragment_Main_Static
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductA_Static_Fragments.*
import app.folder.example.dell.Cardio_Folder_2022.R

class MainActivity : AppCompatActivity() {

    var FM: FragmentManager? = null
    var FT: FragmentTransaction? = null
    private var wifiManager: WifiManager? = null
    var locationManager: LocationManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
        setContentView(R.layout.activity_main)
        wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager

        //drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        //navigationView= (NavigationView) findViewById(R.id.navigationViewId);
        FM = supportFragmentManager
        FT = FM?.beginTransaction()
        FT?.replace(R.id.containerView_a, ProductA_Fragment_Main_Static())?.commit()
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        //toolbar.setTitle("Prelox ");
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(null)
        fn_checkLocation()



    }

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onResume() {
        super.onResume()
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
        builder.setMessage("Yout GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }
            .setNegativeButton("No") { dialog, id ->
                finishAffinity()
                System.exit(0)
            }
        val alert = builder.create()
        alert.show()
    }



    override fun onBackPressed() {
        super.onBackPressed()
        // finishAffinity();
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.product_A_page1 -> {
                fn_checkLocation()
                val fragmentTransaction1 = FM!!.beginTransaction()
                fragmentTransaction1.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_One()
                ).commit()
                true
            }
            R.id.product_A_page2 -> {
                fn_checkLocation()
                val fragmentTransaction2 = FM!!.beginTransaction()
                fragmentTransaction2.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Two()
                ).commit()
                true
            }
            R.id.product_A_page3 -> {
                fn_checkLocation()
                val fragmentTransaction3 = FM!!.beginTransaction()
                fragmentTransaction3.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Three()
                ).commit()
                true
            }
            R.id.product_A_page4 -> {
                fn_checkLocation()
                val fragmentTransaction4 = FM!!.beginTransaction()
                fragmentTransaction4.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Four()
                ).commit()
                true
            }
            R.id.product_A_page5 -> {
                fn_checkLocation()
                val fragmentTransaction5 = FM!!.beginTransaction()
                fragmentTransaction5.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Five()
                ).commit()
                true
            }
            R.id.product_A_page6 -> {
                fn_checkLocation()
                val fragmentTransaction6 = FM!!.beginTransaction()
                fragmentTransaction6.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Six()
                ).commit()
                true
            }
          /*  R.id.product_A_page7 -> {
                fn_checkLocation()
                val fragmentTransaction7 = FM!!.beginTransaction()
                fragmentTransaction7.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Seven()
                ).commit()
                true
            }*/
         /*   R.id.product_A_page8 -> {
                fn_checkLocation()
                val fragmentTransaction8 = FM!!.beginTransaction()
                fragmentTransaction8.replace(
                    R.id.containerView_a,
                    ProductA_Fragment_page_Eight()
                ).commit()
                true
            }*/
            R.id.product_A_Complete -> {
                fn_checkLocation()
                val fragmentTransaction11 = FM!!.beginTransaction()
                fragmentTransaction11.replace(R.id.containerView_a, ProductA_Fragment_Main_Static())
                    .commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}