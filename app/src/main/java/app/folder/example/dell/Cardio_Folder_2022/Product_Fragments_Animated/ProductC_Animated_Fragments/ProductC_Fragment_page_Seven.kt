package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductC_Animated_Fragments

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
class ProductC_Fragment_page_Seven : Fragment() {
    var touch = 0

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
    var image11: ImageView? = null
    var image12: ImageView? = null
    var image13: ImageView? = null
    var image14: ImageView? = null
    var image15: ImageView? = null
    var image16: ImageView? = null
    var image17: ImageView? = null
    var image18: ImageView? = null
    var image19: ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_7, container, false)

        image1 = view.findViewById<View>(R.id.caloc_pg7_img1) as ImageView
        image2 = view.findViewById<View>(R.id.caloc_pg7_img2) as ImageView
        image3 = view.findViewById<View>(R.id.caloc_pg7_img3) as ImageView
        image4 = view.findViewById<View>(R.id.caloc_pg7_img4) as ImageView
        image5 = view.findViewById<View>(R.id.caloc_pg7_img5) as ImageView
        image6 = view.findViewById<View>(R.id.caloc_pg7_img6) as ImageView
        image7 = view.findViewById<View>(R.id.caloc_pg7_img7) as ImageView
        image8 = view.findViewById<View>(R.id.caloc_pg7_img8) as ImageView
        image9 = view.findViewById<View>(R.id.caloc_pg7_img9) as ImageView
        image10 = view.findViewById<View>(R.id.caloc_pg7_img10) as ImageView
        image11 = view.findViewById<View>(R.id.caloc_pg7_img11) as ImageView
        image12 = view.findViewById<View>(R.id.caloc_pg7_img12) as ImageView
        image13 = view.findViewById<View>(R.id.caloc_pg7_img13) as ImageView
        image14 = view.findViewById<View>(R.id.caloc_pg7_img14) as ImageView
        image15 = view.findViewById<View>(R.id.caloc_pg7_img15) as ImageView
        image16 = view.findViewById<View>(R.id.caloc_pg7_img16) as ImageView
        image17 = view.findViewById<View>(R.id.caloc_pg7_img17) as ImageView
        image18 = view.findViewById<View>(R.id.caloc_pg7_img18) as ImageView
        image19 = view.findViewById<View>(R.id.caloc_pg7_img19) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )

        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.slide_from_left_one_sec
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.blink_half_sec
        )
        val animation_image5 = AnimationUtils.loadAnimation(
            context, R.anim.slide_from_left_one_sec
        )
        val animation_image6 = AnimationUtils.loadAnimation(
            context, R.anim.slide_from_left_one_sec
        )
        val animation_image7 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_two_sec
        )
        val animation_image8 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image9 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image10 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image11 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image12 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image13 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image14 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image15 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image16 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image17 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image18 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image19 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )

        image8!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        image10!!.visibility = View.INVISIBLE
        image11!!.visibility = View.INVISIBLE
        image12!!.visibility = View.INVISIBLE
        image13!!.visibility = View.INVISIBLE
        image14!!.visibility = View.INVISIBLE
        image15!!.visibility = View.INVISIBLE
        image16!!.visibility = View.INVISIBLE
        image17!!.visibility = View.INVISIBLE
        image18!!.visibility = View.INVISIBLE
        image19!!.visibility = View.INVISIBLE

        val handler = Handler()
        handler.postDelayed({

            image11!!.visibility = View.VISIBLE
            image11!!.startAnimation(animation_image11)

            image12!!.visibility = View.VISIBLE
            image12!!.startAnimation(animation_image12)

            image13!!.visibility = View.VISIBLE
            image13!!.startAnimation(animation_image13)

            image14!!.visibility = View.VISIBLE
            image14!!.startAnimation(animation_image14)

            image15!!.visibility = View.VISIBLE
            image15!!.startAnimation(animation_image15)

            image16!!.visibility = View.VISIBLE
            image16!!.startAnimation(animation_image16)

            image17!!.visibility = View.VISIBLE
            image17!!.startAnimation(animation_image17)

            image18!!.visibility = View.VISIBLE
            image18!!.startAnimation(animation_image18)

            image19!!.visibility = View.VISIBLE
            image19!!.startAnimation(animation_image19)


            image10!!.visibility = View.VISIBLE
            image10!!.startAnimation(animation_image10)

            image9!!.visibility = View.VISIBLE
            image9!!.startAnimation(animation_image9)

            image8!!.visibility = View.VISIBLE
            image8!!.startAnimation(animation_image8)

        }, 1100)

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image7!!.startAnimation(animation_image7)

        return view
    }
}