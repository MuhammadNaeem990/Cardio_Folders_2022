package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductA_Fragment_page_Three : Fragment() {

    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_3, container, false)

        image1 = view.findViewById<View>(R.id.boschempa_id_page3_image1) as ImageView
        image2 = view.findViewById<View>(R.id.boschempa_id_page3_image2) as ImageView
        image3 = view.findViewById<View>(R.id.boschempa_id_page3_image3) as ImageView
        image4 = view.findViewById<View>(R.id.boschempa_id_page3_image4) as ImageView
        image5 = view.findViewById<View>(R.id.boschempa_id_page3_image5) as ImageView
        image6 = view.findViewById<View>(R.id.boschempa_id_page3_image6) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in
        )
        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_secnd
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_two_sec
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_n_half_sec
        )
        val animation_image5 = AnimationUtils.loadAnimation(
            context, R.anim.blink
        )
        val animation_image6 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_one_second
        )

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)

        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE

        val handler = Handler()
        handler.postDelayed({

            image4!!.visibility = View.VISIBLE
            image4!!.startAnimation(animation_image4)

            image5!!.visibility = View.VISIBLE
            image5!!.startAnimation(animation_image5)

            image6!!.visibility = View.VISIBLE
            image6!!.startAnimation(animation_image6)

        }, 1100)
        return view
    }
}