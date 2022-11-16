package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductH_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductH_Fragment_page_Three : Fragment() {
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_h_fragment_page_3, container, false)

        // image1 = (ImageView)view.findViewById(R.id.penro_id_page3_image1);
        //   image2 = (ImageView)view.findViewById(R.id.penro_id_page3_image2);
        //   image3 = (ImageView)view.findViewById(R.id.penro_id_page3_image3);
        //   image4 = (ImageView)view.findViewById(R.id.penro_id_page3_image4);
        //   image5 = (ImageView)view.findViewById(R.id.penro_id_page3_image5);
        //   image6 = (ImageView)view.findViewById(R.id.penro_id_page3_image6);
        //   image7 = (ImageView)view.findViewById(R.id.penro_id_page3_image7);


        /*Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image1.png").into(image1);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image2.png").into(image2);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image3.png").into(image3);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image4.png").into(image4);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image5.png").into(image5);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image0.png").into(image0);*/


        // Animation animation_image1 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left_half_sec);
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.bounce)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.move_from_left)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.fade_in_two_sec)
        val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_two_sec)
        val animation_image6 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_right_two_seconds)
        val animation_image7 = AnimationUtils.loadAnimation(context, R.anim.fade_in_four_sec)
        //  Animation animation_image8 = AnimationUtils.loadAnimation(getContext(),R.anim.rotate_one_sec);

        // image1.startAnimation(animation_image1);
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        image7!!.startAnimation(animation_image7)
        return view
    }
}