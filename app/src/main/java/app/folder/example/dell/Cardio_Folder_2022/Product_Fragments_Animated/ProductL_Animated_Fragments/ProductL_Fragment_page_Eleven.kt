package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductL_Animated_Fragments

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

class ProductL_Fragment_page_Eleven : Fragment() {
    var image_background: ImageView? = null
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_l_fragment_page_11, container, false)
        image_background = view.findViewById<View>(R.id.cilapen_page11_background) as ImageView
        image1 = view.findViewById<View>(R.id.cilapen_page11_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cilapen_page11_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cilapen_page11_image3) as ImageView
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page11_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page11_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page11_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page11_image3.png")
                    .into(image3)
            }
        }


        //  Animation animation_image_background = AnimationUtils.loadAnimation(getContext(),R.anim.rotate_one_sec);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.move_from_left)
        val animation_image2 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_one_second)
        val animation_image3 =
            AnimationUtils.loadAnimation(context, R.anim.move_up_one_n_half_second)


        //    image_background.startAnimation(animation_image_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        return view
    }
}