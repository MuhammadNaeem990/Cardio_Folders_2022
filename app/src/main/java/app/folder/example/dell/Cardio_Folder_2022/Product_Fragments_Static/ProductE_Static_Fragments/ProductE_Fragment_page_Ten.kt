package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductE_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R
import com.squareup.picasso.Picasso

/**
 * A simple [Fragment] subclass.
 */
class ProductE_Fragment_page_Ten : Fragment() {
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_e_fragment_page_10, container, false)
        image0 = view.findViewById<View>(R.id.zezot_id_page10_image0) as ImageView
        image1 = view.findViewById<View>(R.id.zezot_id_page10_image1) as ImageView
        image2 = view.findViewById<View>(R.id.zezot_id_page10_image2) as ImageView
        image3 = view.findViewById<View>(R.id.zezot_id_page10_image3) as ImageView
        image4 = view.findViewById<View>(R.id.zezot_id_page10_image4) as ImageView
        image5 = view.findViewById<View>(R.id.zezot_id_page10_image5) as ImageView
        image6 = view.findViewById<View>(R.id.zezot_id_page10_image6) as ImageView
        image7 = view.findViewById<View>(R.id.zezot_id_page10_image7) as ImageView
        image8 = view.findViewById<View>(R.id.zezot_id_page10_image8) as ImageView
        //   image9 = (ImageView)view.findViewById(R.id.zezot_id_page10_image9);
        //  image10 = (ImageView)view.findViewById(R.id.zezot_id_page10_image10);
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page2_image1.png")
            .into(image0)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image1.png")
            .into(image1)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image2.png")
            .into(image2)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image3.png")
            .into(image3)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image4.png")
            .into(image4)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image5.png")
            .into(image5)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image6.png")
            .into(image6)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image7.png")
            .into(image7)
        Picasso.get()
            .load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/zezot_page10_image8.png")
            .into(image8)
        image1!!.visibility = View.INVISIBLE
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE


//        Animation animation_image1 = AnimationUtils.loadAnimation(getContext(),R.anim.slide_down_one_secnd);
//        Animation animation_image2 = AnimationUtils.loadAnimation(getContext(),R.anim.slide_down_two_sec);
//        Animation animation_image3 = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in_four_sec);
//        Animation animation_image4 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left_one_n_half_sec);
//         Animation animation_image5 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_n_half_second);
//         Animation animation_image6 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_two_seconds);
//         Animation animation_image7 = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in_four_sec);
//        Animation animation_image8 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_left_one_n_half_sec);
//        // Animation animation_image9 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_n_half_second);
//        // Animation animation_image10 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_two_seconds);
//
//
//
//        image1.startAnimation(animation_image1);
//        image2.startAnimation(animation_image2);
//        image3.startAnimation(animation_image3);
//         image4.startAnimation(animation_image4);
//         image5.startAnimation(animation_image5);
//        image6.startAnimation(animation_image6);
//        image7.startAnimation(animation_image7);
//         image8.startAnimation(animation_image8);
//       //  image9.startAnimation(animation_image5);
//       // image10.startAnimation(animation_image6);
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                if (touch == 1) {
                    val animation_image1 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image1!!.visibility = View.VISIBLE
                    image1!!.startAnimation(animation_image1)
                } else if (touch == 2) {
                    val animation_image2 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 3) {
                    val animation_image3 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 4) {
                    val animation_image4 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 5) {
                    val animation_image5 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 6) {
                    val animation_image6 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } else if (touch == 7) {
                    val animation_image7 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)
                } else if (touch == 8) {
                    val animation_image8 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image8!!.visibility = View.VISIBLE
                    image8!!.startAnimation(animation_image8)
                }
            }
            true
        }
        return view
    }
}