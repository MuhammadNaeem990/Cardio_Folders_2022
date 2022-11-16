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
class ProductG_Fragment_page_Four : Fragment() {
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_g_fragment_page_4, container, false)

      /*  image_background = view.findViewById<View>(R.id.bunail_page4_background) as ImageView
        image_header = view.findViewById<View>(R.id.bunail_page4_header) as ImageView
        image1 = view.findViewById<View>(R.id.bunail_page4_image1) as ImageView
        image2 = view.findViewById<View>(R.id.bunail_page4_image2) as ImageView
        image3 = view.findViewById<View>(R.id.bunail_page4_image3) as ImageView
        image4 = view.findViewById<View>(R.id.bunail_page4_image4) as ImageView
        image5 = view.findViewById<View>(R.id.bunail_page4_image5) as ImageView
        image6 = view.findViewById<View>(R.id.bunail_page4_image6) as ImageView



        // Animation animation_background = AnimationUtils.loadAnimation(getContext(),R.anim.bounce);
        val animation_header = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_half_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.blink_half_sec)
        val animation_image5 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_n_half_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)

        // image_background.startAnimation(animation_background);
        image_header!!.startAnimation(animation_header)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)*/


        return view
    }
}