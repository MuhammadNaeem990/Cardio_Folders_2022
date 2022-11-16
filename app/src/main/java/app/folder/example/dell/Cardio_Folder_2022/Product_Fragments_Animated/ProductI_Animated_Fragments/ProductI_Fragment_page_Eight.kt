package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductI_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductI_Fragment_page_Eight : Fragment() {
    var image_background: ImageView? = null
    var image_header: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image_header3: ImageView? = null
    var image_header4: ImageView? = null
    var image_header5: ImageView? = null
    var image_header6: ImageView? = null
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_i_fragment_page_8, container, false)
        /*image_background = view.findViewById<View>(R.id.vinjec_page8_background) as ImageView
        *//*image_header1 = (ImageView) view.findViewById(R.id.vinjec_page8_header);*//*
        image1 = view.findViewById<View>(R.id.vinjec_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.vinjec_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.vinjec_page8_image3) as ImageView
        image4 = view.findViewById<View>(R.id.vinjec_page8_image4) as ImageView
        image5 = view.findViewById<View>(R.id.vinjec_page8_image5) as ImageView
        image6 = view.findViewById<View>(R.id.vinjec_page8_image6) as ImageView
        image7 = view.findViewById<View>(R.id.vinjec_page8_image7) as ImageView
        image8 = view.findViewById<View>(R.id.vinjec_page8_image8) as ImageView




        //  image_background.startAnimation(animation_background);
        //image_header1.startAnimation(animation_header1);
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.slide_down_half_sec)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 6) {
                    val animation_image7 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                }
            }
            true
        }
        */

        return view
    }
}