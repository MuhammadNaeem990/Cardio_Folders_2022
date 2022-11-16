package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductF_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

class ProductF_Fragment_page_Twelve : Fragment() {
    var image_background: ImageView? = null
    var image_header1: ImageView? = null
    var image_header2: ImageView? = null
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_f_fragment_page_12, container, false)


        /*   image_background = (ImageView) view.findViewById(R.id.zezot_page12_background);

        image1 = (ImageView)view.findViewById(R.id.zezot_page12_image1);
        image2 = (ImageView)view.findViewById(R.id.zezot_page12_image2);
        image3 = (ImageView)view.findViewById(R.id.zezot_page12_image3);
        image4 = (ImageView)view.findViewById(R.id.zezot_page12_image4);
        image5 = (ImageView)view.findViewById(R.id.zezot_page12_image5);
        image6 = (ImageView)view.findViewById(R.id.zezot_page12_image6);
        image7 = (ImageView)view.findViewById(R.id.zezot_page12_image7);
*/
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
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-ldpi/zezot_page12_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_MEDIUM -> {

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-mdpi/zezot_page12_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_HIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-hdpi/zezot_page12_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_XHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xhdpi/zezot_page12_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_XXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxhdpi/zezot_page12_image7.png")
                    .into(image7)
            }
            DisplayMetrics.DENSITY_XXXHIGH -> {
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page2_background.png")
                    .into(image_background)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image1.png")
                    .into(image1)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image2.png")
                    .into(image2)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image3.png")
                    .into(image3)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image4.png")
                    .into(image4)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image5.png")
                    .into(image5)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image6.png")
                    .into(image6)
                Picasso.get()
                    .load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/zezot/drawable-xxxhdpi/zezot_page12_image7.png")
                    .into(image7)
            }
        }
        return view
    }
}