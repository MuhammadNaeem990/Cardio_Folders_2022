package app.folder.example.dell.Cardio_Folder_2022.Main_Fragment_Animated

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.folder.example.dell.Cardio_Folder_2022.Adapter_Animated.ProductI_Adapter
import app.folder.example.dell.Cardio_Folder_2022.R
import app.folder.example.dell.Cardio_Folder_2022.Transformations.SimpleTransformation

/**
 * A simple [Fragment] subclass.
 */
class ProductI_Fragment_Main : Fragment() {
    var locationManager: LocationManager? = null
    var isGPSEnable = false
    var isNetworkEnable = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_i_fragment_main, container, false)
        viewPager_complete = view.findViewById<View>(R.id.viewpager_complete_productI) as ViewPager
        // pagerTabStrip = (PagerTabStrip)view.findViewById(R.id.pagertabstrip_id);
        viewPager_complete!!.adapter = ProductI_Adapter(
            childFragmentManager
        )
        //viewPager_complete.setPageTransformer(true, new ZoomInTransformer());
        viewPager_complete!!.setPageTransformer(true, SimpleTransformation())
        viewPager_complete!!.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                // viewPager_complete.getAdapter().
            }

            override fun onPageSelected(position: Int) {
                fn_checkLocation()
                viewPager_complete!!.adapter!!.notifyDataSetChanged()
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
        return view
    }

    private fun fn_checkLocation() {
        locationManager = context!!.getSystemService(Context.LOCATION_SERVICE) as LocationManager
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
        val builder = AlertDialog.Builder(context)
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
            .setPositiveButton("Yes") { dialog, id -> startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }
            .setNegativeButton("No") { dialog, id -> System.exit(0) }
        val alert = builder.create()
        alert.show()
    }

    companion object {
        var viewPager_complete: ViewPager? = null
    }
}