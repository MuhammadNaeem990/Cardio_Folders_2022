package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductG_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductG_Fragment_page_Six : Fragment() {
    var image_background: ImageView? = null
    var image1_header: ImageView? = null
    var image2_header: ImageView? = null
    var image_header_right: ImageView? = null
    var image_header_left: ImageView? = null
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_g_fragment_page_6, container, false)
        image_background = view.findViewById<View>(R.id.calamox_c_page6_background) as ImageView
        image1 = view.findViewById<View>(R.id.calamox_c_page6_image1) as ImageView
        image2 = view.findViewById<View>(R.id.calamox_c_page6_image2) as ImageView
        image3 = view.findViewById<View>(R.id.calamox_c_page6_image3) as ImageView
        image4 = view.findViewById<View>(R.id.calamox_c_page6_image4) as ImageView
        image5 = view.findViewById<View>(R.id.calamox_c_page6_image5) as ImageView
        image6 = view.findViewById<View>(R.id.calamox_c_page6_image6) as ImageView
        image7 = view.findViewById<View>(R.id.calamox_c_page6_image7) as ImageView
        image8 = view.findViewById<View>(R.id.calamox_c_page6_image8) as ImageView
        image9 = view.findViewById<View>(R.id.calamox_c_page6_image9) as ImageView
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-ldpi/calamox_c_page6_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image9.png")
                    .into(image9) //   Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-hdpi/calamox_c_page6_image10.png").into(image10);
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xhdpi/calamox_c_page6_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxhdpi/calamox_c_page6_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_c/drawable-xxxhdpi/calamox_c_page6_image9.png")
                    .into(image9)
            }
        }
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.move_from_left)
        val animation_image3 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_one_second)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_sec)
        val animation_image5 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_n_half_sec)
        val animation_image6 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_one_n_half_second)
        val animation_image7 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_two_sec)
        val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_two_sec)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        image7!!.startAnimation(animation_image7)
        image8!!.startAnimation(animation_image8)
        return view
    }
}