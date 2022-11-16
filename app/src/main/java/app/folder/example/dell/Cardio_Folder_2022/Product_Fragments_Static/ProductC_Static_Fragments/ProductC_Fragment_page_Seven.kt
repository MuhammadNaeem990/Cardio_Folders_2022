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
class ProductC_Fragment_page_Seven : Fragment() {
    var touch = 0
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
        val view = inflater.inflate(R.layout.product_c_fragment_page_7, container, false)

/*
        image_background = (ImageView)view.findViewById(R.id.bofalgan_page7_background);

        header_image = (ImageView)view.findViewById(R.id.bofalgan_page7_header);
        header_image1 = (ImageView)view.findViewById(R.id.bofalgan_page7_header1);
        header_image2 = (ImageView)view.findViewById(R.id.bofalgan_page7_header2);
        header_image3 = (ImageView)view.findViewById(R.id.bofalgan_page7_header3);
        header_image4 = (ImageView)view.findViewById(R.id.bofalgan_page7_header4);
        header_image5 = (ImageView)view.findViewById(R.id.bofalgan_page7_header5);
        header_image6 = (ImageView)view.findViewById(R.id.bofalgan_page7_header6);
        header_image7 = (ImageView)view.findViewById(R.id.bofalgan_page7_header7);
        header_image8 = (ImageView)view.findViewById(R.id.bofalgan_page7_header8);

        image1 = (ImageView)view.findViewById(R.id.bofalgan_page7_image1);
        image2 = (ImageView)view.findViewById(R.id.bofalgan_page7_image2);
        image3 = (ImageView)view.findViewById(R.id.bofalgan_page7_image3);
        image4 = (ImageView)view.findViewById(R.id.bofalgan_page7_image4);
        image5 = (ImageView)view.findViewById(R.id.bofalgan_page7_image5);
        //image6 = (ImageView)view.findViewById(R.id.bofalgan_page7_image6);*/
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-ldpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-mdpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-hdpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xhdpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxhdpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page6_background.png")
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page7_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page7_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page7_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page7_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/bofalgan/drawable-xxxhdpi/bofalgan_page7_image5.png")
                    .into(image5)
            }
        }
        return view
    }
}