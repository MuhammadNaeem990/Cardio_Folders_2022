package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductK_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductK_Fragment_page_Two : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image_background: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_k_fragment_page_2, container, false)


        /*  image1 = (ImageView) view.findViewById(R.id.cilapen_xdr_page2_image1);*/
       /* image_background = view.findViewById<View>(R.id.cilapen_page8_background) as ImageView
        image1 = view.findViewById<View>(R.id.cilapen_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cilapen_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cilapen_page8_image3) as ImageView
        image4 = view.findViewById<View>(R.id.cilapen_page8_image4) as ImageView
        image5 = view.findViewById<View>(R.id.cilapen_page8_image5) as ImageView
        image6 = view.findViewById<View>(R.id.cilapen_page8_image6) as ImageView
        //   image7 = (ImageView) view.findViewById(R.id.cilapen_page8_image7);
        //   image8 = (ImageView) view.findViewById(R.id.cilapen_page8_image8);
        //   image9 = (ImageView) view.findViewById(R.id.cilapen_page8_image9);
        //  image10 = (ImageView) view.findViewById(R.id.cilapen_page8_image10);
        //  image11 = (ImageView) view.findViewById(R.id.cilapen_page8_image11);



        // Animation anim_background = AnimationUtils.loadAnimation(getContext(), R.anim.bounce);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.slide_down_one_secnd)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_two_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_two_sec)
        //    Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_two_n_half_sec);
        //    Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_quarter_sec);
        //   Animation animation_image9 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_four_sec);
        //   Animation animation_image10= AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_five_sec);
        //  Animation animation_image11 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_six_sec);


        // image_background.startAnimation(anim_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        //    image7.startAnimation(animation_image7);
        //    image8.startAnimation(animation_image8);
        //    image9.startAnimation(animation_image9);
        //    image10.startAnimation(animation_image10);
        //    image11.startAnimation(animation_image11);*/
        return view
    }
}