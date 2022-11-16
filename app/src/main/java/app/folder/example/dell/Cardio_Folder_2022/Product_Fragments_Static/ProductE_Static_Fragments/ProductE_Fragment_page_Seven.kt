package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductE_Static_Fragments

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
class ProductE_Fragment_page_Seven : Fragment() {
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
    var touch = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        /*   image1 = (ImageView) view.findViewById(R.id.qlena_id_page7_image1);
        image2 = (ImageView) view.findViewById(R.id.qlena_id_page7_image2);
        image3 = (ImageView) view.findViewById(R.id.qlena_id_page7_image3);
        image4 = (ImageView) view.findViewById(R.id.qlena_id_page7_image4);
        image5 = (ImageView) view.findViewById(R.id.qlena_id_page7_image5);
        image6 = (ImageView) view.findViewById(R.id.qlena_id_page7_image6);
        image7 = (ImageView) view.findViewById(R.id.qlena_id_page7_image7);
        image8 = (ImageView) view.findViewById(R.id.qlena_id_page7_image8);
        image9 = (ImageView) view.findViewById(R.id.qlena_id_page7_image9);


        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image1.png").into(image1);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image2.png").into(image2);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image3.png").into(image3);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image4.png").into(image4);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image5.png").into(image5);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image6.png").into(image6);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page7_image7.png").into(image7);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page2_image6.png").into(image8);
        Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/aggressive/qlena_page2_image1.png").into(image9);



//        Animation animation_image1 = AnimationUtils.loadAnimation(getContext(),R.anim.one_sec_transition);
//        Animation animation_image2 = AnimationUtils.loadAnimation(getContext(),R.anim.slide_down_one_secnd);
//        Animation animation_image3 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_second);
//        Animation animation_image4 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_one_n_half_second);
//        Animation animation_image5 = AnimationUtils.loadAnimation(getContext(),R.anim.move_from_right_two_seconds);
//        Animation animation_image6 = AnimationUtils.loadAnimation(getContext(),R.anim.one_sec_transition);
//        Animation animation_image7 = AnimationUtils.loadAnimation(getContext(),R.anim.two_sec_transition);

        //image1.startAnimation(animation_image1);
        //  image2.startAnimation(animation_image2);
        //  image3.startAnimation(animation_image3);
        //  image4.startAnimation(animation_image4);
        //  image5.startAnimation(animation_image5);
        //image6.startAnimation(animation_image6);
        // image7.startAnimation(animation_image7);

        image1.setVisibility(View.INVISIBLE);
        image2.setVisibility(View.INVISIBLE);
        image3.setVisibility(View.INVISIBLE);
        image4.setVisibility(View.INVISIBLE);
        image5.setVisibility(View.INVISIBLE);
        image6.setVisibility(View.INVISIBLE);


        view.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    //do something
                    touch++;
                    if (touch == 1) {

                        Animation animation_image2 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_secnd);
                        image1.setVisibility(View.VISIBLE);
                        image1.startAnimation(animation_image2);

                    } else if (touch == 2) {

                        Animation animation_image3 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_secnd);
                        image2.setVisibility(View.VISIBLE);
                        image2.startAnimation(animation_image3);


                    } else if (touch == 3) {
                        Animation animation_image4 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_secnd);
                        image3.setVisibility(View.VISIBLE);
                        image3.startAnimation(animation_image4);

                    } else if (touch == 4) {

                        Animation animation_image5 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_secnd);
                        image4.setVisibility(View.VISIBLE);
                        image4.startAnimation(animation_image5);

                    } else if (touch == 5) {

                        Animation animation_image6 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down_one_secnd);
                        image5.setVisibility(View.VISIBLE);
                        image5.startAnimation(animation_image6);
                    } else if (touch == 6) {
                        Animation animation_image7 = AnimationUtils.loadAnimation(getContext(), R.anim.zoom_in_one_sec);
                        image6.setVisibility(View.VISIBLE);
                        image6.startAnimation(animation_image7);
                    }

                }
                return true;
            }
        });



        */return inflater.inflate(R.layout.product_e_fragment_page_7, container, false)
    }
}