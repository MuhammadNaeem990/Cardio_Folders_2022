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
class ProductA_Fragment_page_Four : Fragment() {

    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_4, container, false)

        image1 = view.findViewById<View>(R.id.boschempa_id_page4_image1) as ImageView
        image2 = view.findViewById<View>(R.id.boschempa_id_page4_image2) as ImageView
        image3 = view.findViewById<View>(R.id.boschempa_id_page4_image3) as ImageView
        image4 = view.findViewById<View>(R.id.boschempa_id_page4_image4) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down
        )
        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_one_half_sec
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_1250_sec
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_one_sec
        )

        image4!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE

        val handler = Handler()
        handler.postDelayed({

            image3!!.visibility = View.VISIBLE
            image3!!.startAnimation(animation_image3)

            image4!!.visibility = View.VISIBLE
            image4!!.startAnimation(animation_image4)

        }, 1100)

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)

        return view
    }
}