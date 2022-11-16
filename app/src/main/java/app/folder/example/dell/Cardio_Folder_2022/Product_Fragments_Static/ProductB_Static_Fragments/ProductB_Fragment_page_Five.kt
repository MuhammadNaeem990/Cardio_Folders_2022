package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductB_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductB_Fragment_page_Five : Fragment() {
    var image0: ImageView? = null
    var image01: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image_header1: ImageView? = null
    var image_background: ImageView? = null
    var image_header2: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_5, container, false)

        /* image_background = (ImageView)view.findViewById(R.id.ciplinz_page5_background);
        Animation animation_image0 = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
        image_background.startAnimation(animation_image0);

        image_header1 = (ImageView)view.findViewById(R.id.ciplinz_page5_header_left);
        Animation animation_header1 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left);
        image_header1.startAnimation(animation_header1);

        image_header2 = (ImageView)view.findViewById(R.id.ciplinz_page5_header_right);
        Animation animation_header = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        image_header2.startAnimation(animation_header);

        image1 = (ImageView)view.findViewById(R.id.ciplinz_page5_image1);
        Animation animation_image1 = AnimationUtils.loadAnimation(getContext(),R.anim.slide_down_one_secnd);
        image1.startAnimation(animation_image1);

        image2 = (ImageView)view.findViewById(R.id.ciplinz_page5_image2);
        Animation animation_image2 = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in_two_sec);
        image2.startAnimation(animation_image2);

        image3 = (ImageView)view.findViewById(R.id.ciplinz_page5_image3);
        Animation animation_image3 = AnimationUtils.loadAnimation(getContext(),R.anim.zoom_in_two_sec);
        image3.startAnimation(animation_image3);


        image4 = (ImageView)view.findViewById(R.id.ciplinz_page5_image4);
       // Animation animation_image4 = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
       // image4.startAnimation(animation_image4);
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
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page5_background.png")
                .into(image_background)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page2_header_left.png")
                .into(image_header1)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page2_header_right.png")
                .into(image_header2)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page5_image1.png")
                .into(image1)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page5_image2.png")
                .into(image2)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page5_image3.png")
                .into(image3)
            Picasso.get()
                .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-sw600dp/ciplinz_page5_image4.png")
                .into(image4)
        } else {
            val density = resources.displayMetrics.densityDpi
            when (density) {
                DisplayMetrics.DENSITY_LOW -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page2_header_right.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-ldpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
                DisplayMetrics.DENSITY_MEDIUM -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page2_header_right.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-mdpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
                DisplayMetrics.DENSITY_HIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page2_header_left.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-hdpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
                DisplayMetrics.DENSITY_XHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page2_header_left.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xhdpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
                DisplayMetrics.DENSITY_XXHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page2_header_left.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxhdpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
                DisplayMetrics.DENSITY_XXXHIGH -> {
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page5_background.png")
                        .into(image_background)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page2_header_left.png")
                        .into(image_header1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page2_header_left.png")
                        .into(image_header2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page5_image1.png")
                        .into(image1)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page5_image2.png")
                        .into(image2)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page5_image3.png")
                        .into(image3)
                    Picasso.get()
                        .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_June/drawable-xxxhdpi/ciplinz_page5_image4.png")
                        .into(image4)
                }
            }
        }
        return view
    }
}