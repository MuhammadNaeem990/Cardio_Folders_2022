package app.folder.example.dell.Cardio_Folder_2022.Activities

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.*
import app.folder.example.dell.Cardio_Folder_2022.Common.Common.aPI
import app.folder.example.dell.Cardio_Folder_2022.Model.APIResponse
import app.folder.example.dell.Cardio_Folder_2022.Prefs.PrefConfig
import app.folder.example.dell.Cardio_Folder_2022.R
import app.folder.example.dell.Cardio_Folder_2022.Remote.IMyApi
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Speciality.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.NetworkInterface
import java.util.*

class LoginActivity : AppCompatActivity(), LocationListener {
    var IMEINumber: String? = null
    var mac_address_display: TextView? = null
    var edt_email: EditText? = null
    var edt_password: EditText? = null
    var btn_login: Button? = null
    var help_button: TextView? = null
    var builder: AlertDialog.Builder? = null
    var mobile_no = "03200202014"
    var imei_new = "No Result "
    var progressDoalog: ProgressDialog? = null
    private var preferenceConfig: PrefConfig? = null
    private var saveLoginCheckBox: CheckBox? = null
    private var loginPreferences: SharedPreferences? = null
    private var loginPrefsEditor: SharedPreferences.Editor? = null
    private var saveLogin: Boolean? = null
    private var username: String? = null
    private var password: String? = null
    var mService: IMyApi? = null
    var lat = "No Result"
    var lon = "No Result"
    var geo_address = "No Result"
    var msg = "Login Successful"
    var error_msg: String? = "Null"
    var locationManager: LocationManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    var latitude = 0.0
    var longitude = 0.0
    var location: Location? = null
    var mac_address: String? = null
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
        setContentView(R.layout.activity_login)
        mac_address_display = findViewById<View>(R.id.macaddress_id) as TextView
        fn_getlocation()
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                (this as Activity),
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                101
            )
        }
        preferenceConfig = PrefConfig(applicationContext)
        val team_temp_result = preferenceConfig!!.readTeam()
        if (preferenceConfig!!.readLoginStatus() && team_temp_result == "CC") {
            startActivity(Intent(this, Spc_A_Activity::class.java))
            finish()
        } else if (preferenceConfig!!.readLoginStatus() && team_temp_result == "Healthcare") {
            startActivity(Intent(this, Spc_A_Activity::class.java))
            finish()
        } else if (preferenceConfig!!.readLoginStatus() && team_temp_result == "Admin") {
            startActivity(Intent(this, Admin_Activity::class.java))
            finish()
        } else if (preferenceConfig!!.readLoginStatus() && team_temp_result == "Resign") {
            finish()
            val homeIntent = Intent(applicationContext, LoginActivity::class.java)
            homeIntent.addCategory(Intent.CATEGORY_HOME)
            homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(homeIntent)
            preferenceConfig!!.writeLoginStatus(false)
        }


        //  mac_address = getMacAddr();
        //Toast.makeText(LoginActivity.this,mac_address, LENGTH_LONG).show();


        //For Mac Address
        val mac_address_shared_pref = preferenceConfig!!.readMac()
        if (mac_address_shared_pref == "") {
            mac_address = macAddr
            preferenceConfig!!.writeMac(mac_address)
            mac_address = mac_address_shared_pref
            mac_address_display!!.text = mac_address
        } else {
            mac_address = mac_address_shared_pref
            mac_address_display!!.text = mac_address
            //  Toast.makeText(this,"saved"+ mac_address, Toast.LENGTH_LONG).show();
        }


        //Toast.makeText(this,mac_address,Toast.LENGTH_LONG).show();
        // final String mac_address = "88:C9:D0:FE:26:7E";

        //Init Service
        mService = aPI

        //Init View
        // txt_register = (TextView) findViewById(R.id.txt_register);
        edt_email = findViewById<View>(R.id.edt_email) as EditText
        edt_password = findViewById<View>(R.id.edt_password) as EditText
        btn_login = findViewById<View>(R.id.btn_login) as Button
        help_button = findViewById<View>(R.id.id_help_button) as TextView
        builder = AlertDialog.Builder(this)
        help_button!!.setOnClickListener {
            val alertDialog =
                AlertDialog.Builder(this@LoginActivity, R.style.AlertDialog) //set icon
                    .setIcon(android.R.drawable.ic_menu_call) //set title
                    .setTitle("Problem sigining in ? Want to make call for Help? ") //set message
                    // .setMessage("Call this Number")
                    //set positive button
                    .setPositiveButton("Yes") { dialogInterface, i -> //set what would happen when positive button is clicked
                        //   Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                        val intent =
                            Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", mobile_no, null))
                        startActivity(intent)
                    } //set negative button
                    .setNegativeButton("No") { dialogInterface, i ->
                        //set what should happen when negative button is clicked
                        //  Toast.makeText(getApplicationContext(),"Nothing Happened",Toast.LENGTH_LONG).show();
                        dialogInterface.cancel()
                        // finish();
                    }
                    .show()
        }


        //Event
        /*txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });*/btn_login!!.setOnClickListener { v ->
            val mac_address_shared_pref_1 = preferenceConfig!!.readMac()
            mac_address = mac_address_shared_pref_1
            mac_address_display!!.text = mac_address_shared_pref_1
            if (fn_checkLocation()) {
                progressDoalog = ProgressDialog(this@LoginActivity)
                progressDoalog!!.setMessage("Loading....")
                progressDoalog!!.show()
                authenticateUser(
                    edt_email!!.text.toString(),
                    edt_password!!.text.toString(),
                    mac_address
                )
                if (v === btn_login) {
                    val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(edt_email!!.windowToken, 0)
                    username = edt_email!!.text.toString()
                    password = edt_password!!.text.toString()
                    if (saveLoginCheckBox!!.isChecked) {
                        loginPrefsEditor!!.putBoolean("saveLogin", true)
                        loginPrefsEditor!!.putString("username", username)
                        loginPrefsEditor!!.putString("password", password)
                        loginPrefsEditor!!.commit()
                    } else {
                        loginPrefsEditor!!.clear()
                        loginPrefsEditor!!.commit()
                    }
                }
            }
        }
        saveLoginCheckBox = findViewById<View>(R.id.saveLoginCheckBox) as CheckBox
        loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE)
        loginPrefsEditor = loginPreferences?.edit()
        saveLogin = loginPreferences?.getBoolean("saveLogin", false)
        if (saveLogin == true) {
            edt_email!!.setText(loginPreferences?.getString("username", ""))
            edt_password!!.setText(loginPreferences?.getString("password", ""))
            saveLoginCheckBox!!.isChecked = true
        }
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

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun runtime_permissions(): Boolean {
        if (Build.VERSION.SDK_INT >= 23 && ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            requestPermissions(
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ), 100
            )
            return true
        }
        return false
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                //enable_buttons();
            } else {
                runtime_permissions()
            }
        }
    }

    private fun authenticateUser(email: String, password: String, mac_address: String?) {
        mService!!.loginUser(email, password, mac_address)
            ?.enqueue(object : Callback<APIResponse?> {
                override fun onResponse(
                    call: Call<APIResponse?>,
                    response: Response<APIResponse?>
                ) {
                    val result = response.body()
                    val Uid_new = loginPreferences!!.getString("username", "")
                    if (Objects.requireNonNull(result)!!.isError()) {
                        progressDoalog!!.dismiss()
                        error_msg = result!!.getError_msg()
                        Toast.makeText(
                            applicationContext,
                            "$error_msg\n     MAC Address :   $mac_address",
                            Toast.LENGTH_LONG
                        ).show()
                        login_error_msg(Uid_new, password, imei_new, mac_address, error_msg)

                        //login_error_msg(Uid_new,password,imei_new ,mac_address,"lOGIN iNFORMATION    wRONG!! Please? Try.. Agian!!");
                        // login_error_msg(Uid_new,password,imei_new ,mac_address,"GAIN? agian..   agianagian!!");

                        //Toast.makeText(getApplicationContext(), "Invalid Login Or Password"/*"Login Error"*/, LENGTH_LONG).show();
                    } else {
                        val User_name = result!!.getUser()!!.getName().toString()
                        login_msg(username, User_name, msg)
                        val team = result.getUser()!!.getTeam().toString()



                        if (team == "CC") {
                            /* progressDoalog.dismiss();
                                Toast.makeText(getApplicationContext(),"Not Your Team",Toast.LENGTH_SHORT).show();*/
                            preferenceConfig!!.writeLoginStatus(true)

                            //Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_SHORT).show();
                            val Uid = result.getUser()!!.getEmployee_Id().toString()
                            val name = result.getUser()!!.getName().toString()
                            Toast.makeText(
                                applicationContext, """
                             Login Successful!!
                             Welcome : $name
                             """.trimIndent(), Toast.LENGTH_LONG
                            ).show()
                            preferenceConfig!!.writeUid(Uid)
                            preferenceConfig!!.writeName(name)
                            preferenceConfig!!.writeTeam(team)
                            startActivity(Intent(applicationContext, Spc_A_Activity::class.java))
                            finish()
                        }


                        else if (team == "Healthcare") {

                            /* progressDoalog.dismiss();
                                Toast.makeText(getApplicationContext(),"Not Your Team",Toast.LENGTH_SHORT).show();*/
                            preferenceConfig!!.writeLoginStatus(true)
                            //Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_SHORT).show();
                            val Uid = result.getUser()!!.getEmployee_Id().toString()
                            val name = result.getUser()!!.getName().toString()
                            //String team = String.valueOf(result.getUser().getTeam());
                            Toast.makeText(
                                applicationContext, """
                             Login Successful!!
                             Welcome : $name
                             """.trimIndent(), Toast.LENGTH_LONG
                            ).show()
                            preferenceConfig!!.writeUid(Uid)
                            preferenceConfig!!.writeName(name)
                            preferenceConfig!!.writeTeam(team)
                            startActivity(Intent(applicationContext, Spc_A_Activity::class.java))
                            finish()
                        }

                        else if (team == "Admin") {

                            /* progressDoalog.dismiss();
                                Toast.makeText(getApplicationContext(),"Not Your Team",Toast.LENGTH_SHORT).show();*/
                            preferenceConfig!!.writeLoginStatus(true)
                            //Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_SHORT).show();
                            val Uid = result.getUser()!!.getEmployee_Id().toString()
                            val name = result.getUser()!!.getName().toString()
                            //String team = String.valueOf(result.getUser().getTeam());
                            Toast.makeText(
                                applicationContext, """
                             Login Successful!!
                             Welcome : $name
                             """.trimIndent(), Toast.LENGTH_LONG
                            ).show()
                            preferenceConfig!!.writeUid(Uid)
                            preferenceConfig!!.writeName(name)
                            preferenceConfig!!.writeTeam(team)
                            startActivity(Intent(applicationContext, Admin_Activity::class.java))
                            finish()
                        }



                        else if (team == "Resign") {
                            preferenceConfig!!.writeLoginStatus(true)

                            //Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_SHORT).show();
                            val Uid = result.getUser()!!.getEmployee_Id().toString()
                            val name = result.getUser()!!.getName().toString()
                            preferenceConfig!!.writeUid(Uid)
                            /* prefConfig.writeLoginStatus(true);*/preferenceConfig!!.writeName(name)
                            preferenceConfig!!.writeTeam(team)
                            progressDoalog!!.dismiss()
                            Toast.makeText(applicationContext, "Not Your Team", Toast.LENGTH_LONG)
                                .show()
                        } else {
                            progressDoalog!!.dismiss()
                            Toast.makeText(
                                applicationContext,
                                 "Not Your Team",
                                Toast.LENGTH_LONG
                            ).show()
                        }

                        /*  String User_name = String.valueOf(result.getUser().getName());
                            login_msg( Uid_new, User_name, msg);
                            preferenceConfig.writeLoginStatus(true);

                            String Uid = String.valueOf(result.getUser().getEmployee_Id());
                            String name = String.valueOf(result.getUser().getName());
                            String team = String.valueOf(result.getUser().getTeam());

                            preferenceConfig.writeUid(Uid);
                            Toast.makeText(getApplicationContext(), "Login Successful!!\n" +
                                    "Welcome : " + name, Toast.LENGTH_LONG).show();

                            startActivity(new Intent(getApplicationContext(), ResideActivity.class));
                            finish();*/
                    }
                }

                override fun onFailure(call: Call<APIResponse?>, t: Throwable) {
                    progressDoalog!!.dismiss()
                    Toast.makeText(
                        applicationContext,  /*t.getMessage()*/
                        "Kindly Check Your Network Connection",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }

    private fun fn_checkLocation(): Boolean {
        locationManager = applicationContext.getSystemService(LOCATION_SERVICE) as LocationManager
        isNetworkEnable = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        isGPSEnable = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        return if (!isGPSEnable && !isNetworkEnable) {
            buildAlertMessageNoGps()
            //Toast.makeText(this, "Enable Gps First", LENGTH_LONG).show();
            /*  finishAffinity();*/
            /*  System.exit(0);*/
            //startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
            false
        } else {
            true
        }
    }

    private fun fn_getlocation() {
        locationManager = applicationContext.getSystemService(LOCATION_SERVICE) as LocationManager
        isNetworkEnable = locationManager!!.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        isGPSEnable = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        if (!isGPSEnable && !isNetworkEnable) {
            buildAlertMessageNoGps()
            /*Toast.makeText(this, "Enable Gps First", LENGTH_LONG).show();
            finishAffinity();
            System.exit(0);*/
            //startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
        } else {
            if (isGPSEnable) {
                location = null
                if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return
                }
                locationManager!!.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    300000,
                    0f,
                    this
                )
                if (locationManager != null) {
                    location = locationManager!!.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                    if (location != null) {
                        latitude = location!!.latitude
                        longitude = location!!.longitude
                        fn_update(location!!)
                    }
                }
            }
            if (isNetworkEnable) {
                location = null
                if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return
                }
                locationManager!!.requestLocationUpdates(
                    LocationManager.NETWORK_PROVIDER,
                    300000,
                    0f,
                    this
                )
                if (locationManager != null) {
                    location =
                        locationManager!!.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
                    if (location != null) {
                        latitude = location!!.latitude
                        longitude = location!!.longitude
                        fn_update(location!!)
                    }
                }
            }
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
                //dialog.cancel();
            }
        val alert = builder.create()
        alert.show()
    }

    private fun fn_update(location: Location) {

        /*  intent.putExtra("latutide",location.getLatitude()+"");
        intent.putExtra("longitude",location.getLongitude()+"");
        sendBroadcast(intent);*/
        latitude = location.latitude
        longitude = location.longitude
        try {
            val geocoder = Geocoder(this, Locale.getDefault())
            val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
            geo_address = (addresses[0].getAddressLine(0) + ", " +
                    addresses[0].getAddressLine(1)
                    + ", " + addresses[0].getAddressLine(2))
            // Toast.makeText(this,"lat: "+latitude+"\nlon:"+longitude,Toast.LENGTH_LONG).show();
            //locationText.setText(geo_address);
            //Toast.makeText(this,geo_address,Toast.LENGTH_LONG).show();
            /* Uid_new = preferenceConfig.readUid();
            location_method(Uid_new,lon, lat,geo_address);*/
        } catch (e: Exception) {
        }
    }

    override fun onLocationChanged(location: Location) {
        lat = location.latitude.toString()
        lon = location.longitude.toString()
        // locationText.setText("Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude());
        //locationText.setText("Latitude: " + lat + "\n Longitude: " + lon);
        try {
            val geocoder = Geocoder(this, Locale.getDefault())
            val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
            geo_address = """
                
                ${addresses[0].getAddressLine(0)}, ${addresses[0].getAddressLine(1)}, ${
                addresses[0].getAddressLine(
                    2
                )
            }
                """.trimIndent()

            //Toast.makeText(this,"lat: "+latitude+"\nlon:"+longitude,Toast.LENGTH_LONG).show();
            //String Uid_new = preferenceConfig.readUid();
            // Toast.makeText(this, geo_address + " \n " + Uid_new, LENGTH_LONG).show();
            val Uid_new = loginPreferences!!.getString("username", "")
            //Toast.makeText(this,Uid_new,Toast.LENGTH_LONG).show();
            location_method(Uid_new, lon, lat, geo_address)
        } catch (e: Exception) {
        }
    }

    override fun onStatusChanged(provider: String, status: Int, extras: Bundle) {}
    override fun onProviderEnabled(provider: String) {}
    override fun onProviderDisabled(provider: String) {


        /*  finishAffinity();
        System.exit(0);

        Toast.makeText(this, "Enable Gps, It is Disbaled", Toast.LENGTH_SHORT).show();*/
        //buildAlertMessageNoGps();
    }

    private fun location_method(Uid_new: String, geo_address: String, lon: String, lat: String) {
        mService!!.submitLocation(Uid_new, geo_address, lon, lat)
            ?.enqueue(object : Callback<APIResponse?> {
                override fun onResponse(
                    call: Call<APIResponse?>,
                    response: Response<APIResponse?>
                ) {
                }

                override fun onFailure(call: Call<APIResponse?>, t: Throwable) {}
            })
    }

    private fun login_msg(Uid_new: String?, User_name: String, msg: String) {
        mService!!.loginConfirmation(Uid_new, User_name, msg)
            ?.enqueue(object : Callback<APIResponse?> {
                override fun onResponse(
                    call: Call<APIResponse?>,
                    response: Response<APIResponse?>
                ) {
                }

                override fun onFailure(call: Call<APIResponse?>, t: Throwable) {}
            })
    }

    private fun login_error_msg(
        Uid_new: String,
        password: String,
        imei_new: String,
        mac_address: String?,
        error_msg: String?
    ) {
        mService!!.loginError(Uid_new, password, imei_new, mac_address, error_msg)
            ?.enqueue(object : Callback<APIResponse?> {
                override fun onResponse(
                    call: Call<APIResponse?>,
                    response: Response<APIResponse?>
                ) {
                }

                override fun onFailure(call: Call<APIResponse?>, t: Throwable) {}
            })
    }

    companion object {
        private const val REQUEST_CODE = 101
        const val mBroadcastStringAction = "com.truiton.broadcast.string"//handle exception

        // res1.append(Integer.toHexString(b & 0xFF) + ":");
        val macAddr: String
            get() {
                try {
                    val all: List<NetworkInterface> =
                        Collections.list(NetworkInterface.getNetworkInterfaces())
                    for (nif in all) {
                        if (!nif.name.equals("wlan0", ignoreCase = true)) continue
                        val macBytes = nif.hardwareAddress ?: return ""
                        val res1 = StringBuilder()
                        for (b in macBytes) {
                            // res1.append(Integer.toHexString(b & 0xFF) + ":");
                            res1.append(String.format("%02X:", b))
                        }
                        if (res1.length > 0) {
                            res1.deleteCharAt(res1.length - 1)
                        }
                        return res1.toString()
                    }
                } catch (ex: Exception) {
                    //handle exception
                }
                return ""
            }
    }
}