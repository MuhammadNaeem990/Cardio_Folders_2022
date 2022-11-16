package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductL_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

class ProductL_Fragment_page_Seven : Fragment() {
    var image_background: ImageView? = null
    var image001: ImageView? = null
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
    var image11: ImageView? = null
    var image12: ImageView? = null
    var image13: ImageView? = null
    var image14: ImageView? = null
    var image15: ImageView? = null
    var image16: ImageView? = null
    var image17: ImageView? = null
    var image01: ImageView? = null
    var image21: ImageView? = null
    var image31: ImageView? = null
    var image41: ImageView? = null
    var image51: ImageView? = null
    var image61: ImageView? = null
    var image71: ImageView? = null
    var image81: ImageView? = null
    var image91: ImageView? = null
    var text1: TextView? = null
    var text2: TextView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image_header3: ImageView? = null
    var image_footer: ImageView? = null
    var image_header4: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_l_fragment_page_7, container, false)
        image_background = view.findViewById<View>(R.id.cilapen_page7_background) as ImageView
        image1 = view.findViewById<View>(R.id.cilapen_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.cilapen_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.cilapen_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.cilapen_page7_image4) as ImageView
        image4!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Eight())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image5 = view.findViewById<View>(R.id.cilapen_page7_image5) as ImageView
        image6 = view.findViewById<View>(R.id.cilapen_page7_image6) as ImageView
        image6!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Ten())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image7 = view.findViewById<View>(R.id.cilapen_page7_image7) as ImageView
        image8 = view.findViewById<View>(R.id.cilapen_page7_image8) as ImageView
        image8!!.setOnClickListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_Nine())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        image9 = view.findViewById<View>(R.id.cilapen_page7_image9) as ImageView
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-ldpi/cilapen_page7_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-mdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-hdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xhdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxhdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality2020_June/drawable-xxxhdpi/cilapen_page7_image9.png")
                    .into(image9)
            }
        }


        //  Animation animation_image_background = AnimationUtils.loadAnimation(getContext(),R.anim.rotate_one_sec);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.blink)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.rotate)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.rotate_one_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.rotate)
        val animation_image7 = AnimationUtils.loadAnimation(context, R.anim.rotate_one_sec)
        val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.rotate)
        val animation_image9 = AnimationUtils.loadAnimation(context, R.anim.rotate_one_sec)


        //    image_background.startAnimation(animation_image_background);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        image7!!.startAnimation(animation_image7)
        image8!!.startAnimation(animation_image8)
        image9!!.startAnimation(animation_image9)
        return view
    }
}