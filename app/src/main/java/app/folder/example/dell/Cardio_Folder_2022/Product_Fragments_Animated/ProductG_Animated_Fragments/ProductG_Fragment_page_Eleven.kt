package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductG_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

class ProductG_Fragment_page_Eleven : Fragment() {
    var image_background: ImageView? = null
    var image1_header: ImageView? = null
    var image2_header: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_g_fragment_page_11, container, false)
        image_background = view.findViewById<View>(R.id.calamox_c_page11_background) as ImageView
        image1 = view.findViewById<View>(R.id.calamox_c_page11_image1) as ImageView
        image2 = view.findViewById<View>(R.id.calamox_c_page11_image2) as ImageView
        image3 = view.findViewById<View>(R.id.calamox_c_page11_image3) as ImageView
        image4 = view.findViewById<View>(R.id.calamox_c_page11_image4) as ImageView
        image5 = view.findViewById<View>(R.id.calamox_c_page11_image5) as ImageView
        image6 = view.findViewById<View>(R.id.calamox_c_page11_image6) as ImageView
        image7 = view.findViewById<View>(R.id.calamox_c_page11_image7) as ImageView
        image8 = view.findViewById<View>(R.id.calamox_c_page11_image8) as ImageView
        image9 = view.findViewById<View>(R.id.calamox_c_page11_image9) as ImageView
        image10 = view.findViewById<View>(R.id.calamox_c_page11_image10) as ImageView
        val width = resources.configuration.screenWidthDp
        val metrics = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(metrics)
        val yInches = metrics.heightPixels / metrics.ydpi
        val xInches = metrics.widthPixels / metrics.xdpi
        val diagonalInches = Math.sqrt((xInches * xInches + yInches * yInches).toDouble())
        val density = resources.displayMetrics.densityDpi
        when (density) {
            DisplayMetrics.DENSITY_LOW -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-mdpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page11_image10.png")
                    .into(image10)
            }
        }
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        image1!!.startAnimation(animation_image1)
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE
        image9!!.visibility = View.INVISIBLE
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_left)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 6) {
                    val animation_image7 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                } else if (touch == 7) {
                    val animation_image8 =
                        AnimationUtils.loadAnimation(context, R.anim.move_from_right)
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                } else if (touch == 9) {
                    val animation_image9 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image9!!.visibility = View.VISIBLE
                    image9!!.startAnimation(animation_image9)
                }
            }
            true
        }
        return view
    }
}