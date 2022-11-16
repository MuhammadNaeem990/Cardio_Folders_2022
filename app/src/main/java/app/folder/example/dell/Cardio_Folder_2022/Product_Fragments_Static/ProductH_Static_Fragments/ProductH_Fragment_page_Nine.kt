package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductH_Static_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductH_Fragment_page_Nine : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var image9: ImageView? = null
    var image0: ImageView? = null
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_h_fragment_page_9, container, false)

        // image0 = (ImageView) view.findViewById(R.id.penro_id_page9_image1);
        // image1 = (ImageView) view.findViewById(R.id.penro_id_page9_image2);
        // image2 = (ImageView) view.findViewById(R.id.penro_id_page9_image3);
        // image3 = (ImageView) view.findViewById(R.id.penro_id_page9_image4);
        //  image4 = (ImageView) view.findViewById(R.id.penro_id_page9_image5);
        //  image5 = (ImageView) view.findViewById(R.id.penro_id_page9_image6);
        //  image6 = (ImageView) view.findViewById(R.id.penro_id_page9_image7);
        //    image7 = (ImageView) view.findViewById(R.id.penro_id_page9_image8);
        // image8 = (ImageView) view.findViewById(R.id.penro_id_page9_image9);
        // image9 = (ImageView) view.findViewById(R.id.penro_id_page9_image1);
        //image5 = (ImageView)view.findViewById(R.id.penro_id_page9_image1);


//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page3_image0.png").into(image0);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image1.png").into(image1);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image2.png").into(image2);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image3.png").into(image3);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image4.png").into(image4);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image5.png").into(image5);
//        //Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page2_image6.png").into(image6);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image7.png").into(image7);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image8.png").into(image8);
//        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/calamox_agg_c_page10_image9.png").into(image9);


        // image0.setVisibility(View.INVISIBLE);
        //  image1.setVisibility(View.INVISIBLE);
        image2!!.visibility = View.INVISIBLE
        image3!!.visibility = View.INVISIBLE
        image4!!.visibility = View.INVISIBLE
        image5!!.visibility = View.INVISIBLE
        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        // image9.setVisibility(View.INVISIBLE);


        //    final ImageView shine = (ImageView) view.findViewById(R.id.shine_calamox_agg_c_page10);
        view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                //do something
                touch++
                /* if (touch == 1) {
                            Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
                            image1.setVisibility(View.VISIBLE);
                            image1.startAnimation(animation_image1);
                        } else*/if (touch == 1) {
                    val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image2!!.visibility = View.VISIBLE
                    image2!!.startAnimation(animation_image2)
                } else if (touch == 2) {
                    val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image3!!.visibility = View.VISIBLE
                    image3!!.startAnimation(animation_image3)
                } else if (touch == 3) {
                    val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image4!!.visibility = View.VISIBLE
                    image4!!.startAnimation(animation_image4)
                } else if (touch == 4) {
                    val animation_image5 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image5!!.visibility = View.VISIBLE
                    image5!!.startAnimation(animation_image5)
                } else if (touch == 5) {
                    val animation_image6 = AnimationUtils.loadAnimation(context, R.anim.slide_down)
                    image6!!.visibility = View.VISIBLE
                    image6!!.startAnimation(animation_image6)
                } /*else if (touch == 7) {
                        Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
                        image7.setVisibility(View.VISIBLE);
                        image7.startAnimation(animation_image7);
                    } else if (touch == 8) {
                        Animation animation_image8 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_one_sec);
                        image8.setVisibility(View.VISIBLE);
                        image8.startAnimation(animation_image8);
                    }*/ else if (touch == 6) {
                    val animation_image7 =
                        AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
                    image7!!.visibility = View.VISIBLE
                    image7!!.startAnimation(animation_image7)


                    /* new Handler().postDelayed(new Runnable() {
                                public void run() {
    
                                    Animation animation = new TranslateAnimation(0, 750, 0, 0);
                                    animation.setDuration(1500);
                                    animation.setFillAfter(false);
                                    animation.setInterpolator(new AccelerateDecelerateInterpolator());
                                    animation.setRepeatCount(Animation.INFINITE);
                                    shine.startAnimation(animation);
    
                                }
                            }, 600);*/
                }
            }
            true
        }
        return view
    }
}