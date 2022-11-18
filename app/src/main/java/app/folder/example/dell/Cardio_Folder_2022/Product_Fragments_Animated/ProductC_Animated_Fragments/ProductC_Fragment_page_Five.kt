package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductC_Animated_Fragments

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductC_Fragment_page_Five : Fragment() {
    var image0: ImageView? = null
    var image: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var touch = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_5, container, false)

        image1 = view.findViewById<View>(R.id.caloc_pg5_img1) as ImageView
        image2 = view.findViewById<View>(R.id.caloc_pg5_img2) as ImageView
        image3 = view.findViewById<View>(R.id.caloc_pg5_img3) as ImageView
        image4 = view.findViewById<View>(R.id.caloc_pg5_img4) as ImageView
        image5 = view.findViewById<View>(R.id.caloc_pg5_img5) as ImageView
        image6 = view.findViewById<View>(R.id.caloc_pg5_img6) as ImageView
        image7 = view.findViewById<View>(R.id.caloc_pg5_img7) as ImageView
        image8 = view.findViewById<View>(R.id.caloc_pg5_img8) as ImageView
        image9 = view.findViewById<View>(R.id.caloc_pg5_img9) as ImageView
        image10 = view.findViewById<View>(R.id.caloc_pg5_img10) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )
        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.slide_from_left_one_sec
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left_1200
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_two_sec
        )
        val animation_image5 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )
        val animation_image6 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )
        val animation_image7 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_half_sec
        )
        val animation_image8 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_one_half_sec
        )
        val animation_image9 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_secnd
        )
        val animation_image10 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_secnd
        )

//        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE


        val handler = Handler()
        handler.postDelayed({

//            image7!!.visibility = View.VISIBLE
//            image4!!.startAnimation(animation_image4)

            image5!!.visibility = View.VISIBLE
            image5!!.startAnimation(animation_image5)

            image7!!.visibility = View.VISIBLE
            image7!!.startAnimation(animation_image7)

            image8!!.visibility = View.VISIBLE
            image8!!.startAnimation(animation_image8)

            image6!!.visibility = View.VISIBLE
            image6!!.startAnimation(animation_image6)

        }, 1100)

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
//        image5!!.startAnimation(animation_image5)
//        image6!!.startAnimation(animation_image6)
////        image7!!.startAnimation(animation_image7)
////        image8!!.startAnimation(animation_image8)
        image9!!.startAnimation(animation_image9)
        image10!!.startAnimation(animation_image10)

        return view
    }
}