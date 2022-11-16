package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductL_Animated_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductL_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
//   String videopath = "android.resource://app.folder.example.dell.Speciality_Folder_2021/" + R.raw.cilapen_title_video_dec_2020;
    : Fragment() {
    var image_background: ImageView? = null
    var image001: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    var image13: ImageView? = null
    var image14: ImageView? = null
    var image15: ImageView? = null
    var image16: ImageView? = null
    var image17: ImageView? = null
    var image01: ImageView? = null
    var image21: ImageView? = null
    var image31: ImageView? = null
    var image41: ImageView? = null
    var image51: ImageView? = null
    var image61: ImageView? = null
    var image71: ImageView? = null
    var image81: ImageView? = null
    var image91: ImageView? = null
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_l_fragment_page_1, container, false)
        /*image2 = view.findViewById<View>(R.id.boferin_id_page2_iamge1) as ImageView
        image2!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Two())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image3 = view.findViewById<View>(R.id.cilapen_title_page3) as ImageView
        image3!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Three())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image4 = view.findViewById<View>(R.id.cilapen_title_page4) as ImageView
        image4!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Four())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image5 = view.findViewById<View>(R.id.cilapen_title_page5) as ImageView
        image5!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Six())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image6 = view.findViewById<View>(R.id.cilapen_title_page6) as ImageView
        image6!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Five())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image7 = view.findViewById<View>(R.id.cilapen_title_page7) as ImageView
        image7!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Seven())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }*/
        return view
    }
}