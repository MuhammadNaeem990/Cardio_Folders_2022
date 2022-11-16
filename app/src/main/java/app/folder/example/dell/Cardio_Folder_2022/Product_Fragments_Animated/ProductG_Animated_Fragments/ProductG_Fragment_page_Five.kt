package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductG_Animated_Fragments

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
class ProductG_Fragment_page_Five : Fragment() {
    var image_background: ImageView? = null
    var image_header: ImageView? = null
    var image_heading: ImageView? = null
    var image_blink1: ImageView? = null
    var image_blink2: ImageView? = null
    var image_blink3: ImageView? = null
    var image0: ImageView? = null
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_g_fragment_page_5, container, false)

       /* image_background = view.findViewById<View>(R.id.bunail_page5_background) as ImageView
        image_header = view.findViewById<View>(R.id.bunail_page5_header) as ImageView
        image1 = view.findViewById<View>(R.id.bunail_page5_image1) as ImageView
        image2 = view.findViewById<View>(R.id.bunail_page5_image2) as ImageView
        image3 = view.findViewById<View>(R.id.bunail_page5_image3) as ImageView
        image4 = view.findViewById<View>(R.id.bunail_page5_image4) as ImageView
        image5 = view.findViewById<View>(R.id.bunail_page5_image5) as ImageView
        image6 = view.findViewById<View>(R.id.bunail_page5_image6) as ImageView
        image7 = view.findViewById<View>(R.id.bunail_page5_image7) as ImageView
        image8 = view.findViewById<View>(R.id.bunail_page5_image8) as ImageView
        image9 = view.findViewById<View>(R.id.bunail_page5_image9) as ImageView
        image10 = view.findViewById<View>(R.id.bunail_page5_image10) as ImageView



        // Animation animation_background = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        val animation_header = AnimationUtils.loadAnimation(context, R.anim.fade_in)

        // image_background.startAnimation(animation_background);
        image_header!!.startAnimation(animation_header)


        // image1.setVisibility(View.INVISIBLE);
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    *//*Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_half_sec);
                            image1.setVisibility(View.VISIBLE);
                            image1.startAnimation(animation_image1);*//*
                    val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 6) {
                    val animation_image7 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                } else if (touch == 7) {
                    val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.bounce)
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                } else if (touch == 8) {
                    val animation_image9 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image9!!.visibility = View.VISIBLE
                    image9!!.startAnimation(animation_image9)
                }
            }
            true
        }*/


        return view
    }
}