package app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Speciality

import android.animation.ArgbEvaluator
import android.app.AlertDialog
import android.content.Intent
import android.location.LocationManager
import android.net.wifi.WifiManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import app.folder.example.dell.Cardio_Folder_2022.Activities.LoginActivity
import app.folder.example.dell.Cardio_Folder_2022.Prefs.PrefConfig
import app.folder.example.dell.Cardio_Folder_2022.R
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Model
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Adapter.Speciality.Adapter_Spc_AB2
import java.util.*

class Spc_AB2_Activity : AppCompatActivity() {
    var viewPager: ViewPager? = null
    var adapter_spec_ab2: Adapter_Spc_AB2? = null
    var models: MutableList<Model>? = null
    var colors: Array<Int>? = null
    var argbEvaluator = ArgbEvaluator()
    private var preferenceConfig: PrefConfig? = null
    private var wifiManager: WifiManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    var locationManager: LocationManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Toolbar open*/requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
        /*toolbar close*/setContentView(R.layout.activity_spc_ab2)
        wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager

        fn_checkLocation()
        preferenceConfig = PrefConfig(applicationContext)
        val toolbar = findViewById<View>(R.id.toolbar_activity2) as Toolbar
        //toolbar.setTitle("Merofer");
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(null)
        models = ArrayList()
        models?.add(Model(R.drawable.boferin_page1_image1, R.drawable.boferin_title_text, "  "))
        models?.add(Model(R.drawable.boferin_page1_image1, R.drawable.boferin_title_text, "  "))
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )
        models?.add(Model(R.drawable.boferin_page1_image1, R.drawable.boferin_title_text, "  "))
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )
        models?.add(
            Model(
                R.drawable.boferin_page1_image1,
                R.drawable.boferin_title_text,
                "  "
            )
        )

/*
        models.add(new Model(R.drawable.cilapen_vial_bottle_title_folder, "Cilapen", "Leading From Front "));
        models.add(new Model(R.drawable.cilapen_title_folder_men, "Cilapen", "Leading From Front "));
        models.add(new Model(R.drawable.cilapen_xdr_title, "Cilapen XDR", "  Leading From Front"));
        models.add(new Model(R.drawable.cebac_title_folder, "Cebac", " One For All "));
        models.add(new Model(R.drawable.cebac_title_folder, "Cebac Gynae", " One For All  "));
        models.add(new Model(R.drawable.ticozid_title_folder, "Ticozid", " Time To Move Forward "));

*/adapter_spec_ab2 = Adapter_Spc_AB2(models as ArrayList<Model>, this)
        viewPager = findViewById(R.id.viewPager)
        viewPager?.setAdapter(adapter_spec_ab2)
        viewPager?.setPadding(100, 0, 100, 0)
        val colors_temp = arrayOf(
            resources.getColor(R.color.color1),
            resources.getColor(R.color.color2),
            resources.getColor(R.color.color3),
            resources.getColor(R.color.color13),
            resources.getColor(R.color.color4),
            resources.getColor(R.color.color5),
            resources.getColor(R.color.color6),
            resources.getColor(R.color.color7),
            resources.getColor(R.color.color8)
        )
        colors = colors_temp
        viewPager?.setOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position < adapter_spec_ab2!!.count - 1 && position < colors!!.size - 1) {
                    viewPager?.setBackgroundColor(
                        (argbEvaluator.evaluate(
                            positionOffset,
                            colors!![position],
                            colors!![position + 1]
                        ) as Int)
                    )
                } else {
                    viewPager?.setBackgroundColor(colors!![colors!!.size - 1])
                }
            }

            override fun onPageSelected(position: Int) {}
            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.app_bar_menu_logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.product_Logout -> {
                //Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_LONG).show();
                finish()
                val homeIntent = Intent(applicationContext, LoginActivity::class.java)
                homeIntent.addCategory(Intent.CATEGORY_HOME)
                homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(homeIntent)
                preferenceConfig!!.writeLoginStatus(false)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun fn_checkLocation() {
        locationManager = applicationContext.getSystemService(LOCATION_SERVICE) as LocationManager
        isNetworkEnable = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        isGPSEnable = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (!isGPSEnable && !isNetworkEnable) {
            buildAlertMessageNoGps()
            //Toast.makeText(this, "Enable Gps First", LENGTH_LONG).show();
            /*  finishAffinity();*/
            /*  System.exit(0);*/
            //startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            //return false;
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

    public override fun onResume() {
        super.onResume()
        fn_checkLocation()
        //registerReceiver(mReceiver, mIntentFilter);
    }

    /*    private BroadcastReceiver mReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getAction().equals(mBroadcastStringAction)) {
               */
    /* System.exit(0);
                finishAffinity();
                // Toast.makeText(getApplicationContext(),"Exit App",Toast.LENGTH_SHORT).show();
                Intent homeIntent = new Intent(getApplicationContext(),LoginActivity.class);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                preferenceConfig.writeLoginStatus(false);*/
    /*

                finish();
                Intent homeIntent = new Intent(getApplicationContext(),LoginActivity.class);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                preferenceConfig.writeLoginStatus(false);


            }
        }
    };*/
    /*   @Override
    protected void onPause() {
        unregisterReceiver(mReceiver);
        super.onPause();
    }*/
    override fun onStart() {
        super.onStart()
        /* IntentFilter intentFilter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(wifiStateReceiver, intentFilter);*/
    }

    override fun onStop() {
        super.onStop()
        //  unregisterReceiver(wifiStateReceiver);
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}