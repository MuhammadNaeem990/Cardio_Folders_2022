package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductI_Static_Fragments

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
class ProductI_Fragment_page_Two : Fragment() {
    var image_background: ImageView? = null
    var image_header: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
    var image_header3: ImageView? = null
    var image_header4: ImageView? = null
    var image_header5: ImageView? = null
    var image_header6: ImageView? = null
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
    private val mainLayout: ViewGroup? = null
    private val xDelta = 0
    private val yDelta = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_i_fragment_page_2, container, false)

        /*  image_background = (ImageView) view.findViewById(R.id.flazol_page2_background);
        image_header = (ImageView) view.findViewById(R.id.flazol_page2_header);
        image_header1 = (ImageView) view.findViewById(R.id.flazol_page2_header1);
        image_header2 = (ImageView) view.findViewById(R.id.flazol_page2_header2);
        image_header3 = (ImageView) view.findViewById(R.id.flazol_page2_header3);
        image_header4 = (ImageView) view.findViewById(R.id.flazol_page2_header4);
        image_header5 = (ImageView) view.findViewById(R.id.flazol_page2_header5);
        image_header6 = (ImageView) view.findViewById(R.id.flazol_page2_header6);

        image1 = (ImageView) view.findViewById(R.id.flazol_page2_image1);
        image2 = (ImageView) view.findViewById(R.id.flazol_page2_image2);
        image3 = (ImageView) view.findViewById(R.id.flazol_page2_image3);
        image4 = (ImageView) view.findViewById(R.id.flazol_page2_image4);
        image5 = (ImageView) view.findViewById(R.id.flazol_page2_image5);
        image6 = (ImageView) view.findViewById(R.id.flazol_page2_image6);
        image7 = (ImageView) view.findViewById(R.id.flazol_page2_image7);
        image8 = (ImageView) view.findViewById(R.id.flazol_page2_image8);
        image9 = (ImageView) view.findViewById(R.id.flazol_page2_image9);
        image10 = (ImageView) view.findViewById(R.id.flazol_page2_image10);*/
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-ldpi/flazol_page2_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-mdpi/flazol_page2_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-hdpi/flazol_page2_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xhdpi/flazol_page2_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxhdpi/flazol_page2_image10.png")
                    .into(image10)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header.png")
                    .into(image_header)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header1.png")
                    .into(image_header1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header2.png")
                    .into(image_header2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header3.png")
                    .into(image_header3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header4.png")
                    .into(image_header4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header5.png")
                    .into(image_header5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_header6.png")
                    .into(image_header6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image7.png")
                    .into(image7)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image8.png")
                    .into(image8)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image9.png")
                    .into(image9)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/flazol/drawable-xxxhdpi/flazol_page2_image10.png")
                    .into(image10)
            }
        }
        return view
    }
}