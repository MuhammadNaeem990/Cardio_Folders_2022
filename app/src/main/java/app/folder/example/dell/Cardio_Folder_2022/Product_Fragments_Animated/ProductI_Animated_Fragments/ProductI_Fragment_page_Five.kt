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
class ProductI_Fragment_page_Five : Fragment() {
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
        val view = inflater.inflate(R.layout.product_i_fragment_page_5, container, false)
       /* image_background = view.findViewById<View>(R.id.vinjec_page5_background) as ImageView
        //image_header1 = (ImageView) view.findViewById(R.id.vinjec_page2_header);
        image1 = view.findViewById<View>(R.id.vinjec_page5_image1) as ImageView
        image2 = view.findViewById<View>(R.id.vinjec_page5_image2) as ImageView
        image3 = view.findViewById<View>(R.id.vinjec_page5_image3) as ImageView
        image4 = view.findViewById<View>(R.id.vinjec_page5_image4) as ImageView
        //  image5 = (ImageView) view.findViewById(R.id.vinjec_page4_image5);
        //   image6 = (ImageView) view.findViewById(R.id.vinjec_page4_image6);
        //   image7 = (ImageView) view.findViewById(R.id.vinjec_page4_image7);




        //   Animation animation_background = AnimationUtils.loadAnimation(getContext(), R.anim.blink);
        // Animation animation_header1 = AnimationUtils.loadAnimation(getContext(), R.anim.blink_half_sec);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_half_sec)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.slide_from_left_two_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.move_up_two_second)
        *//* Animation animation_image5 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_sec);
        Animation animation_image6 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_n_half_sec);
        Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_two_sec);*//*


        //  image_background.startAnimation(animation_background);
        *//* image_header1.startAnimation(animation_header1);*//*image1!!.startAnimation(
            animation_image1
        )
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)*/
        //   image5.startAnimation(animation_image5);
        //   image6.startAnimation(animation_image6);
        //   image7.startAnimation(animation_image7);
        return view
    }
}