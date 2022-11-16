package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductD_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductD_Fragment_page_Two  //String videopath = "android.resource://app.folder.example.dell.venusfolders/" + R.raw.somezol_page2_chart;
    : Fragment() {

    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image_backgroound: ImageView? = null
    var image_header: ImageView? = null

    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_d_fragment_page_2, container, false)


        return view
    }
}