package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductD_Static_Fragments

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
class ProductD_Fragment_page_Nine : Fragment() {
    var image0: ImageView? = null
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
    var image1_header: ImageView? = null
    var image2_header: ImageView? = null
    var image_background: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.product_d_fragment_page_9, container, false)


        /*   image_background = (ImageView) view.findViewById(R.id.calamox_b_page9_background);
        image1_header = (ImageView) view.findViewById(R.id.calamox_b_page9_header1);
        image2_header = (ImageView) view.findViewById(R.id.calamox_b_page9_header2);
        image1 = (ImageView) view.findViewById(R.id.calamox_b_page9_image1);
        image2 = (ImageView) view.findViewById(R.id.calamox_b_page9_image2);
        image3 = (ImageView) view.findViewById(R.id.calamox_b_page9_image3);
        image4 = (ImageView) view.findViewById(R.id.calamox_b_page9_image4);
        image5 = (ImageView) view.findViewById(R.id.calamox_b_page9_image5);
        image6 = (ImageView) view.findViewById(R.id.calamox_b_page9_image6);
*/
        val width = resources.configuration.screenWidthDp
        val metrics = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(metrics)
        val yInches = metrics.heightPixels / metrics.ydpi
        val xInches = metrics.widthPixels / metrics.xdpi
        val diagonalInches = Math.sqrt((xInches * xInches + yInches * yInches).toDouble())
        if (diagonalInches >= 7.5) {
            // 7.5inch device or bigger
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page2_background.png")
                .into(image_background)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page2_header1.png")
                .into(image1_header)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page2_header2.png")
                .into(image2_header)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image1.png")
                .into(image1)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image2.png")
                .into(image2)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image3.png")
                .into(image3)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image4.png")
                .into(image4)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image5.png")
                .into(image5)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/calamox_b_page9_image6.png")
                .into(image6)
        } else {
            val density = resources.displayMetrics.densityDpi
            when (density) {
                DisplayMetrics.DENSITY_LOW -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
                DisplayMetrics.DENSITY_MEDIUM -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
                DisplayMetrics.DENSITY_HIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
                DisplayMetrics.DENSITY_XHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
                DisplayMetrics.DENSITY_XXHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
                DisplayMetrics.DENSITY_XXXHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page2_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page2_header1.png")
                        .into(image1_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page2_header2.png")
                        .into(image2_header)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image4.png")
                        .into(image4)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image5.png")
                        .into(image5)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/calamox_b_page9_image6.png")
                        .into(image6)
                }
            }
        }


        //   Animation animation_background = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
        val animation_header1 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_left_half_sec)
        val animation_header2 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_half_second)
        val animation_image1 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_one_second)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.fade_in_three_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.fade_in_four_sec)


        //   image_background.startAnimation(animation_background);
        image1_header!!.startAnimation(animation_header1)
        image2_header!!.startAnimation(animation_header2)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        return view
    }
}