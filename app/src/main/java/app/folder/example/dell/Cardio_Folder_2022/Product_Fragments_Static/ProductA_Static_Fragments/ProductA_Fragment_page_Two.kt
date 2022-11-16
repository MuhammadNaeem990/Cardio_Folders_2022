package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductA_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductA_Fragment_page_Two  //int touch = 0;
//   VideoView videoView, videoView2;
//  MediaController mediaController;
//String videopath = "android.resource://app.folder.example.dell.indigo_folders/" + R.raw.omeprazole;
    : Fragment() {
    var header1: ImageView? = null
    var header2: ImageView? = null
    var image_background: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null
    var image9: ImageView? = null
    var image10: ImageView? = null
    var image11: ImageView? = null
    var image12: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        /* image_background = (ImageView) view.findViewById(R.id.calamox_a_page2_background);

        image1 = (ImageView) view.findViewById(R.id.calamox_a_page2_image1);
        image2 = (ImageView) view.findViewById(R.id.calamox_a_page2_image2);
        image3 = (ImageView) view.findViewById(R.id.calamox_a_page2_image3);
        image4 = (ImageView) view.findViewById(R.id.calamox_a_page2_image4);
        image5 = (ImageView) view.findViewById(R.id.calamox_a_page2_image5);
        image6 = (ImageView) view.findViewById(R.id.calamox_a_page2_image6);
        image7 = (ImageView) view.findViewById(R.id.calamox_a_page2_image7);
        image8 = (ImageView) view.findViewById(R.id.calamox_a_page2_image8);
        image9 = (ImageView) view.findViewById(R.id.calamox_a_page2_image9);
        image10 = (ImageView) view.findViewById(R.id.calamox_a_page2_image10);*/


        /*   int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-ldpi/calamox_a_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-mdpi/calamox_a_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-hdpi/calamox_a_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xhdpi/calamox_a_page2_image10.png").into(image10);

                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxhdpi/calamox_a_page2_image10.png").into(image10);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_background.png").into(image_background);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image6.png").into(image6);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image7.png").into(image7);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image8.png").into(image8);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image9.png").into(image9);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Aggressive2020_December/calamox_a/drawable-xxxhdpi/calamox_a_page2_image10.png").into(image10);

                break;
        }*/return inflater.inflate(R.layout.product_a_fragment_page_2, container, false)
    }
}