package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductE_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductE_Fragment_page_Nine : Fragment() {
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
        val view = inflater.inflate(R.layout.product_e_fragment_page_9, container, false)

        /* image0 = (ImageView)view.findViewById(R.id.zezot_id_page9_image0);
        image1 = (ImageView)view.findViewById(R.id.zezot_id_page9_image1);
        image2= (ImageView)view.findViewById(R.id.zezot_id_page9_image2);
        image3 = (ImageView)view.findViewById(R.id.zezot_id_page9_image3);*/
        //  image5 = (ImageView)view.findViewById(R.id.zezot_id_page3_image5);
        // image6 = (ImageView)view.findViewById(R.id.zezot_id_page2_image5);
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page2_image1.png")
            .into(image0)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page9_image1.png")
            .into(image1)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page9_image2.png")
            .into(image2)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page9_image3.png")
            .into(image3)
        // Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page4_image4.png").into(image5);


        //Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page3_image5.png").into(image6);
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.slide_down_one_secnd)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down_two_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.fade_in_four_sec)

        // Animation animation_image4 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left_one_n_half_sec);
        // Animation animation_image5 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_n_half_second);
        // Animation animation_image6 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_two_seconds);
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        // image4.startAnimation(animation_image4);
        // image5.startAnimation(animation_image5);
        //image6.startAnimation(animation_image6);
        return view
    }
}