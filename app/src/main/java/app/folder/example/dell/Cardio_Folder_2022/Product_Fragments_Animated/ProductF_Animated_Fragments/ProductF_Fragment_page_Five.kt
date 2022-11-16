package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductF_Animated_Fragments

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
class ProductF_Fragment_page_Five : Fragment() {
    var image_background: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
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
        val view = inflater.inflate(R.layout.product_f_fragment_page_5, container, false)
      /*  image_background = view.findViewById<View>(R.id.ticozid_page5_background) as ImageView
        image1 = view.findViewById<View>(R.id.ticozid_page5_image1) as ImageView
        image2 = view.findViewById<View>(R.id.ticozid_page5_image2) as ImageView
        image3 = view.findViewById<View>(R.id.ticozid_page5_image3) as ImageView
        image4 = view.findViewById<View>(R.id.ticozid_page5_image4) as ImageView
        image5 = view.findViewById<View>(R.id.ticozid_page5_image5) as ImageView
        image6 = view.findViewById<View>(R.id.ticozid_page5_image6) as ImageView
        //  image7 = (ImageView) view.findViewById(R.id.ticozid_page5_image7);
        //  image8 = (ImageView) view.findViewById(R.id.ticozid_page2_image8);
        //   image9 = (ImageView) view.findViewById(R.id.ticozid_page2_image9);




        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.blink_one_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.blink_one_n_half_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)
        // Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_two_sec);

        //    Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_n_half_sec);
        //   Animation animation_image9 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_three_sec);


        // image_background.startAnimation(anim_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        //image7.startAnimation(animation_image7);
        //  image8.startAnimation(animation_image8);
        //   image9.startAnimation(animation_image9);*/
        return view
    }
}