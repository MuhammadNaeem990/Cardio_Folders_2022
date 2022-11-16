package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductB_Animated_Fragments

import android.os.Bundle
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
class ProductB_Fragment_page_Six : Fragment() {


    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image_background: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null

    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_6, container, false)

        image_background = view.findViewById<View>(R.id.rova_page6_background) as ImageView
        image_header1 = view.findViewById<View>(R.id.rova_page6_header1) as ImageView
        image_header2 = view.findViewById<View>(R.id.rova_page6_header2) as ImageView

        image1 = view.findViewById<View>(R.id.rova_page6_image1) as ImageView
        image2 = view.findViewById<View>(R.id.rova_page6_image2) as ImageView
        image3 = view.findViewById<View>(R.id.rova_page6_image3) as ImageView
        image4 = view.findViewById<View>(R.id.rova_page6_image4) as ImageView
        image5 = view.findViewById<View>(R.id.rova_page6_image5) as ImageView

        val animation_header1 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left_half_sec
        )
        val animation_header2 = AnimationUtils.loadAnimation(
            context, R.anim.blink
        )

        image_header1!!.startAnimation(animation_header1)
        image_header2!!.startAnimation(animation_header2)
        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE

        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image1 = AnimationUtils.loadAnimation(
                        context, R.anim.fade_in
                    )
                    image1!!.visibility = View.VISIBLE
                    image1!!.startAnimation(animation_image1)
                } else if (touch == 2) {
                    val animation_image2 = AnimationUtils.loadAnimation(
                        context, R.anim.fade_in
                    )
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 3) {
                    val animation_image3 = AnimationUtils.loadAnimation(
                        context, R.anim.fade_in
                    )
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 4) {
                    val animation_image4 = AnimationUtils.loadAnimation(
                        context, R.anim.fade_in
                    )
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 5) {
                    val animation_image5 = AnimationUtils.loadAnimation(
                        context, R.anim.zoom_in_one_sec
                    )
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                }
            }
            true
        }

        return view
    }
}