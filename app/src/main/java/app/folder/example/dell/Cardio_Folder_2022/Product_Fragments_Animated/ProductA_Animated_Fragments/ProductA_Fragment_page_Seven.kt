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


class ProductA_Fragment_page_Seven : Fragment() {

    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null

    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_7, container, false)

        image1 = view.findViewById<View>(R.id.boschempa_id_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.boschempa_id_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.boschempa_id_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.boschempa_id_page7_image4) as ImageView
        image5 = view.findViewById<View>(R.id.boschempa_id_page7_image5) as ImageView
        image6 = view.findViewById<View>(R.id.boschempa_id_page7_image6) as ImageView
        image7 = view.findViewById<View>(R.id.boschempa_id_page7_image7) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left
        )
        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.blink
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_one_half_sec
        )
        val animation_image5 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_secnd
        )
        val animation_image6 = AnimationUtils.loadAnimation(
            context, R.anim.slide_up_one_sec
        )
        val animation_image7 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )

        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE

        val handler = Handler()
        handler.postDelayed({

            image5!!.visibility = View.VISIBLE
            image5!!.startAnimation(animation_image5)

            image6!!.visibility = View.VISIBLE
            image6!!.startAnimation(animation_image6)

            image7!!.visibility = View.VISIBLE
            image7!!.startAnimation(animation_image7)

        }, 1100)

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)

        return view
    }
}