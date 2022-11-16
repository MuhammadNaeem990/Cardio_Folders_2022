package app.folder.example.dell.Cardio_Folder_2022.Activities_Static

import android.app.AlertDialog
import android.content.Intent
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.support.design.widget.NavigationView
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.*
import app.folder.example.dell.Cardio_Folder_2022.Main_Fragment_Static.ProductC_Fragment_Main_Static
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductC_Static_Fragments.*
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductC_Activity : AppCompatActivity() {
    var drawerLayout: DrawerLayout? = null
    var navigationView: NavigationView? = null
    var navigationView2: NavigationView? = null
    var FM: FragmentManager? = null
    var FT: FragmentTransaction? = null
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
        setContentView(R.layout.activity_product_c)

        /* drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
          navigationView= (NavigationView) findViewById(R.id.navigationViewId);
            navigationView2 = (NavigationView)findViewById(R.id.navigationView2);
*/
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        //toolbar.setTitle("Product C");
        setSupportActionBar(toolbar)
        supportActionBar?.setTitle(null)
        FM = supportFragmentManager
        FT = FM?.beginTransaction()
        FT?.replace(R.id.containerView, ProductC_Fragment_Main_Static())?.commit()
        fn_checkLocation()

        /*navigationView2.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();

                if (item.getItemId()== R.id.product_A) {
                    //toolbar.setTitle("Page 1");

                    Thread td = new Thread() {
                        public void run() {
                            try {
                                sleep(400);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            } finally {
                                //FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                //fragmentTransaction.replace(R.id.containerView, new ProductA_Fragment_page_One()).commit();
                                Intent i = new Intent(ProductC_Activity.this, MainActivity.class);
                                startActivity(i);

                            }
                        }
                    };td.start();
                }

                return false;
            }
        });*/


        /*   navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@android.support.annotation.NonNull MenuItem item) {
                drawerLayout.closeDrawers();

                  if (item.getItemId()== R.id.C_page_1) {
                          //  toolbar.setTitle("Page - I ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_One()).commit();
                                    }
                                }
                            };td.start();
                        }

                          if (item.getItemId()== R.id.C_page_2) {
                          //  toolbar.setTitle("Page - II ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Two()).commit();
                                    }
                                }
                            };td.start();
                        }

                          if (item.getItemId()== R.id.C_page_3) {
                           // toolbar.setTitle("Page - III ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Three()).commit();
                                    }
                                }
                            };td.start();
                        }

                         if (item.getItemId()== R.id.C_page_4) {
                           // toolbar.setTitle("Page - IV ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Four()).commit();
                                    }
                                }
                            };td.start();
                        }

                      */
        /*  if (item.getItemId()== R.id.C_page_5) {
                            toolbar.setTitle("Page - V ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Five()).commit();
                                    }
                                }
                            };td.start();
                        }

                         if (item.getItemId()== R.id.C_page_6) {
                            toolbar.setTitle("Page - VI ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Six()).commit();
                                    }
                                }
                            };td.start();
                        }

                            if (item.getItemId()== R.id.C_page_7) {
                            toolbar.setTitle("Page - VII ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Seven()).commit();
                                    }
                                }
                            };td.start();
                        }

                         if (item.getItemId()== R.id.C_page_8) {
                            toolbar.setTitle("Page - VIII ");

                            Thread td = new Thread() {
                                public void run() {
                                    try {
                                        sleep(400);
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    } finally {
                                        FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                        fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_page_Eight()).commit();
                                    }
                                }
                            };td.start();
                        }*/
        /*



                if (item.getItemId()== R.id.home_c) {
                  //  toolbar.setTitle("Page");

                    Thread td = new Thread() {
                        public void run() {
                            try {
                                sleep(400);
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            } finally {
                                FragmentTransaction fragmentTransaction= FM.beginTransaction();
                                fragmentTransaction.replace(R.id.containerView, new ProductC_Fragment_Main()).commit();
                            }
                        }
                    };td.start();
                }

                return false;
            }
        });*/


        /*final ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();*/
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

    override fun onResume() {
        super.onResume()
        fn_checkLocation()
    }

    override fun onStart() {
        super.onStart()
        // IntentFilter intentFilter = new IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION);
        //  registerReceiver(wifiStateReceiver, intentFilter);
    }

    override fun onStop() {
        super.onStop()
        // unregisterReceiver(wifiStateReceiver);
    }

    /* private BroadcastReceiver wifiStateReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int wifiStateExtra = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
                    WifiManager.WIFI_STATE_UNKNOWN);

            switch (wifiStateExtra) {
                case WifiManager.WIFI_STATE_ENABLED:
                   // Toast.makeText(getApplicationContext(),"Wifi is Enabled",Toast.LENGTH_LONG).show();
                    break;
                case WifiManager.WIFI_STATE_DISABLED:
                    finishAffinity();
                    System.exit(0);
                   // Toast.makeText(getApplicationContext(),"Wifi is Disabled",Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };*/
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.app_bar_menu_3, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.product_C_page1 -> {
                val fragmentTransaction1 = FM!!.beginTransaction()
                fragmentTransaction1.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_One()
                ).commit()
                true
            }
            R.id.product_C_page2 -> {
                val fragmentTransaction2 = FM!!.beginTransaction()
                fragmentTransaction2.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_Two()
                ).commit()
                true
            }
            R.id.product_C_page3 -> {
                val fragmentTransaction3 = FM!!.beginTransaction()
                fragmentTransaction3.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_Three()
                ).commit()
                true
            }
            R.id.product_C_page4 -> {
                val fragmentTransaction4 = FM!!.beginTransaction()
                fragmentTransaction4.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_Four()
                ).commit()
                true
            }
            R.id.product_C_page5 -> {
                val fragmentTransaction5 = FM!!.beginTransaction()
                fragmentTransaction5.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_Five()
                ).commit()
                true
            }
            R.id.product_C_page6 -> {
                val fragmentTransaction6 = FM!!.beginTransaction()
                fragmentTransaction6.replace(
                    R.id.containerView,
                    ProductC_Fragment_page_Six()
                ).commit()
                true
            }

            R.id.product_C_Complete -> {
                val fragmentTransaction11 = FM!!.beginTransaction()
                fragmentTransaction11.replace(R.id.containerView, ProductC_Fragment_Main_Static())
                    .commit()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}