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
class ProductH_Fragment_page_Seven : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_h_fragment_page_7, container, false)

        //  image1 = (ImageView)view.findViewById(R.id.penro_id_page7_image1);
        //  image2 = (ImageView)view.findViewById(R.id.penro_id_page7_image2);
        //  image3 = (ImageView)view.findViewById(R.id.penro_id_page7_image3);
        //  image4 = (ImageView)view.findViewById(R.id.penro_id_page7_image4);
        //  image5 = (ImageView)view.findViewById(R.id.penro_id_page7_image5);
        //   image6 = (ImageView)view.findViewById(R.id.penro_id_page7_image6);
        //   image7 = (ImageView)view.findViewById(R.id.penro_id_page7_image7);
        //   image8 = (ImageView)view.findViewById(R.id.penro_id_page7_image8);

        /* Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image0.png").into(image0);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page7_image1.png").into(image1);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page7_image2.png").into(image2);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page7_image3.png").into(image3);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page7_image4.png").into(image4);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page7_image5.png").into(image5);*/

        // Animation animation_image1 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left_half_sec);
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.bounce)
        //  Animation animation_image3 = AnimationUtils.loadAnimation(getContext(),R.anim.move_up_one_sec);
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_sec)
        val animation_image5 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_left_one_n_half_sec)
        val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.move_from_left_two_sec)
        val animation_image7 =
            AnimationUtils.loadAnimation(context, R.anim.move_from_left_two_n_half_sec)
        val animation_image8 = AnimationUtils.loadAnimation(context, R.anim.blink)
        //        Animation animation_image9 = AnimationUtils.loadAnimation(getContext(),R.anim.move_up_two_and_half_sec);

        //   image1.startAnimation(animation_image1);
        image2!!.startAnimation(animation_image2)
        //   image3.startAnimation(animation_image3);
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)
        image6!!.startAnimation(animation_image6)
        image7!!.startAnimation(animation_image7)
        image8!!.startAnimation(animation_image8)
        return view
    }
}