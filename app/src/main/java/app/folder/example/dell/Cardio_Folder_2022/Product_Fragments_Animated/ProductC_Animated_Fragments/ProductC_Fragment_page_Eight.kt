package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductC_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductC_Fragment_page_Eight : Fragment() {
    var touch = 0
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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_8, container, false)

        image1 = view.findViewById<View>(R.id.caloc_pg8_img1) as ImageView
        image2 = view.findViewById<View>(R.id.caloc_pg8_img2) as ImageView
        image3 = view.findViewById<View>(R.id.caloc_pg8_img3) as ImageView
        image4 = view.findViewById<View>(R.id.caloc_pg8_img4) as ImageView

        image5 = view.findViewById<View>(R.id.caloc_pg8_img5) as ImageView
        image6 = view.findViewById<View>(R.id.caloc_pg8_img6) as ImageView
        image7 = view.findViewById<View>(R.id.caloc_pg8_img7) as ImageView
        image8 = view.findViewById<View>(R.id.caloc_pg8_img8) as ImageView
        image9 = view.findViewById<View>(R.id.caloc_pg8_img9) as ImageView
        image10 = view.findViewById<View>(R.id.caloc_pg8_img10) as ImageView


        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )

        image1!!.startAnimation(animation_image1)
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        image10!!.visibility = View.INVISIBLE

        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 2) {
                    val animation_image3 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)

                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)
                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
//                       shine.startAnimation(animation)

                } else if (touch == 4) {
                    val animation_image5= AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)

                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)
                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
//                       shine2.startAnimation(animation)

                } else if (touch == 5) {
                    val animation_image6 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)

                }else if (touch == 6){
                    val animation_image7 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)

                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)

                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
//                    shine2.startAnimation(animation)
                }

                else if (touch == 7 ){
                    val animation_image8 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_from_left_one_sec

                    )
                    val animation_image9 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd

                    )
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                    image9!!.visibility = View.VISIBLE
                    image9!!.startAnimation(animation_image9)
                }

                else if (touch == 8 ){
                    val animation_image10 = AnimationUtils.loadAnimation(
                        context, R.anim.zoom_in_one_sec
                    )

                    image10!!.visibility = View.VISIBLE
                    image10!!.startAnimation(animation_image10)
                }

                else if (touch == 1 ){
                    val animation_image2 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )

                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                }
            }
            true
        }
        return view
    }
}