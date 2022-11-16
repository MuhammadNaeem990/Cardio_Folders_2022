package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductB_Animated_Fragments

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
class ProductB_Fragment_page_Eight : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null

    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_8, container, false)

       /* image1 = view.findViewById<View>(R.id.cabosch_id_page8_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cabosch_id_page8_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cabosch_id_page8_image3) as ImageView
        image4 = view.findViewById<View>(R.id.cabosch_id_page8_image4) as ImageView
        image5 = view.findViewById<View>(R.id.cabosch_id_page8_image5) as ImageView
        image6 = view.findViewById<View>(R.id.cabosch_id_page8_image6) as ImageView

        val shine = view.findViewById<View>(R.id.shine1) as ImageView
        val shine2 = view.findViewById<View>(R.id.shine2) as ImageView

        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE

        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image1 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image1!!.visibility = View.VISIBLE
                    image1!!.startAnimation(animation_image1)
                } else if (touch == 2) {
                    val animation_image2 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)

                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)

                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
                    shine.startAnimation(animation)


                } else if (touch == 3) {
                    val animation_image3 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)
                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
                    shine2.startAnimation(animation)

                } else if (touch == 4) {
                    val animation_image4 = AnimationUtils.loadAnimation(
                        context, R.anim.blink
                    )
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)

                }else if (touch == 5 ){
                    val animation_image5 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_up_one_sec
                    )
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)

                    val animation: Animation = TranslateAnimation(0F, 970F, 0F, 0F)

                    animation.duration = 3000
                    animation.fillAfter = false
                    animation.repeatCount = -1
                    animation.interpolator = AccelerateDecelerateInterpolator()
                    shine2.startAnimation(animation)
                }

                else if (touch == 6 ){
                    val animation_image6 = AnimationUtils.loadAnimation(
                        context, R.anim.move_up_one_sec
                    )
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                }
            }
            true
        }
*/



        return view
    }
}