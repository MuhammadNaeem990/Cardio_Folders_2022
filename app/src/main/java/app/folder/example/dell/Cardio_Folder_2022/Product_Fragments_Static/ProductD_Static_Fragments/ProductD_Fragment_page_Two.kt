package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductD_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductD_Fragment_page_Two  //String videopath = "android.resource://app.folder.example.dell.venusfolders/" + R.raw.somezol_page2_chart;
    : Fragment() {
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
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_d_fragment_page_2, container, false)

/*
        image_background = (ImageView) view.findViewById(R.id.calamox_b_page2_background);
        image1_header = (ImageView) view.findViewById(R.id.calamox_b_page2_header);


        image1 = (ImageView) view.findViewById(R.id.calamox_b_page2_image1);
        image2 = (ImageView) view.findViewById(R.id.calamox_b_page2_image2);
        image3 = (ImageView) view.findViewById(R.id.calamox_b_page2_image3);*/
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-ldpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-ldpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-ldpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-ldpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-ldpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-mdpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-mdpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-mdpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-mdpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-mdpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-hdpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-hdpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-hdpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-hdpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-hdpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xhdpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xhdpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xhdpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xhdpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xhdpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxhdpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxhdpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxhdpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxhdpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxhdpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxxhdpi/calamox_b_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxxhdpi/calamox_b_page2_header.png")
                    .into(image1_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxxhdpi/calamox_b_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxxhdpi/calamox_b_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_b/drawable-xxxhdpi/calamox_b_page2_image3.png")
                    .into(image3)
            }
        }
        return view
    }
}