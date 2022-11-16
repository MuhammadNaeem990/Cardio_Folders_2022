package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductA_Static_Fragments

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
class ProductA_Fragment_page_Ten : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var header1: ImageView? = null
    var header2: ImageView? = null
    var image_background: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_10, container, false)
        image_background = view.findViewById<View>(R.id.calamox_a_page10_background) as ImageView
        image1 = view.findViewById<View>(R.id.calamox_a_page10_image1) as ImageView
        image2 = view.findViewById<View>(R.id.calamox_a_page10_image2) as ImageView
        image3 = view.findViewById<View>(R.id.calamox_a_page10_image3) as ImageView
        image4 = view.findViewById<View>(R.id.calamox_a_page10_image4) as ImageView
        image5 = view.findViewById<View>(R.id.calamox_a_page10_image5) as ImageView
        image6 = view.findViewById<View>(R.id.calamox_a_page10_image6) as ImageView
        image7 = view.findViewById<View>(R.id.calamox_a_page10_image7) as ImageView
        image8 = view.findViewById<View>(R.id.calamox_a_page10_image8) as ImageView
        image9 = view.findViewById<View>(R.id.calamox_a_page10_image9) as ImageView
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page10_image9.png")
                    .into(image9)
            }
        }
        return view
    }
}