package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductC_Static_Fragments

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
class ProductC_Fragment_page_Nine : Fragment() {
    var image_background: ImageView? = null
    var image: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var header_image: ImageView? = null
    var header_image1: ImageView? = null
    var header_image2: ImageView? = null
    var header_image3: ImageView? = null
    var header_image4: ImageView? = null
    var header_image5: ImageView? = null
    var header_image6: ImageView? = null
    var header_image7: ImageView? = null
    var header_image8: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_9, container, false)
        image_background = view.findViewById<View>(R.id.bofalgan_page9_background) as ImageView
        header_image = view.findViewById<View>(R.id.bofalgan_page9_header) as ImageView
        header_image1 = view.findViewById<View>(R.id.bofalgan_page9_header1) as ImageView
        header_image2 = view.findViewById<View>(R.id.bofalgan_page9_header2) as ImageView
        header_image3 = view.findViewById<View>(R.id.bofalgan_page9_header3) as ImageView
        header_image4 = view.findViewById<View>(R.id.bofalgan_page9_header4) as ImageView
        header_image5 = view.findViewById<View>(R.id.bofalgan_page9_header5) as ImageView
        header_image6 = view.findViewById<View>(R.id.bofalgan_page9_header6) as ImageView
        header_image7 = view.findViewById<View>(R.id.bofalgan_page9_header7) as ImageView
        header_image8 = view.findViewById<View>(R.id.bofalgan_page9_header8) as ImageView
        image1 = view.findViewById<View>(R.id.bofalgan_page9_image1) as ImageView
        image2 = view.findViewById<View>(R.id.bofalgan_page9_image2) as ImageView
        image3 = view.findViewById<View>(R.id.bofalgan_page9_image3) as ImageView
        image4 = view.findViewById<View>(R.id.bofalgan_page9_image4) as ImageView
        image5 = view.findViewById<View>(R.id.bofalgan_page9_image5) as ImageView
        image6 = view.findViewById<View>(R.id.bofalgan_page9_image6) as ImageView
        image7 = view.findViewById<View>(R.id.bofalgan_page9_image7) as ImageView
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page9_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page9_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page9_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page9_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page9_image6.png")
                    .into(image6)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header.png")
                    .into(header_image)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header1.png")
                    .into(header_image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header2.png")
                    .into(header_image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header3.png")
                    .into(header_image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header4.png")
                    .into(header_image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header5.png")
                    .into(header_image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header6.png")
                    .into(header_image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header7.png")
                    .into(header_image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page2_header8.png")
                    .into(header_image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page9_image7.png")
                    .into(image7)
            }
        }
        return view
    }
}