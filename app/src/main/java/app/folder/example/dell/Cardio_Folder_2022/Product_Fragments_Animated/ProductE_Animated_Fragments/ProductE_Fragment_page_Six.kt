package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductE_Animated_Fragments

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
class ProductE_Fragment_page_Six : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var touch: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_e_fragment_page_6, container, false)

        /*image1 = view.findViewById<View>(R.id.cebosh_id_page6_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cebosh_id_page6_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cebosh_id_page6_image3) as ImageView
        image4 = view.findViewById<View>(R.id.cebosh_id_page6_image4) as ImageView

        image5 = view.findViewById<View>(R.id.cebosh_id_page6_image5) as ImageView
        image6 = view.findViewById<View>(R.id.cebosh_id_page6_image6) as ImageView
        image7 = view.findViewById<View>(R.id.cebosh_id_page6_image7) as ImageView
        image8 = view.findViewById<View>(R.id.cebosh_id_page6_image8) as ImageView



//
//
//        val animation_image1 = AnimationUtils.loadAnimation(
//            context, R.anim.mercury_mictra_fade_in
//        )
//
//        val animation_image2 = AnimationUtils.loadAnimation(
//            context, R.anim.mercury_mictra_blink_half_sec
//        )
//        val animation_image4 = AnimationUtils.loadAnimation(
//            context, R.anim.mercury_mictra_blink_half_sec
//        )
//        val animation_image6 = AnimationUtils.loadAnimation(
//            context, R.anim.mercury_mictra_blink_half_sec
//        )
//         val animation_image8 = AnimationUtils.loadAnimation(
//             context, R.anim.mercury_mictra_blink_half_sec
//         )


//         image1!!.startAnimation(animation_image1)
//         image2!!.startAnimation(animation_image2)
//         image4!!.startAnimation(animation_image4)
//         image6!!.startAnimation(animation_image6)




        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE


        image3!!.visibility = View.INVISIBLE

        image4!!.visibility = View.INVISIBLE

        image5!!.visibility = View.INVISIBLE

        image6!!.visibility = View.INVISIBLE

        image7!!.visibility = View.INVISIBLE

        image8!!.visibility = View.INVISIBLE






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
                } else if (touch == 3) {
                    val animation_image3 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 4) {
                    val animation_image4 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)

                }else if (touch == 5 ){
                    val animation_image5 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                }

                else if (touch == 6 ){
                    val animation_image6 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_down_one_secnd
                    )
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                }
                else if (touch == 7 ){
                    val animation_image7 = AnimationUtils.loadAnimation(
                        context, R.anim.zoom_in_one_sec
                    )
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                }

                else if (touch == 8 ){
                    val animation_image8 = AnimationUtils.loadAnimation(
                        context, R.anim.slide_up_one_sec
                    )
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                }

            }
            true
        }
*/

        return view
    }
}