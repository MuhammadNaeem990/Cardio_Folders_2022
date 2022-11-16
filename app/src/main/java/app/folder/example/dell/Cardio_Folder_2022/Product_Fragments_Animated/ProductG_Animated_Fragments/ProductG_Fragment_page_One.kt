package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductG_Animated_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.MediaController
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductG_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
//  String videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.bunail_title_video_june_2020;
    : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image_background: ImageView? = null
    var image4: ImageView? = null
    var mediaController: MediaController? = null
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_g_fragment_page_1, container, false)
        /*
        image1 = (ImageView) view.findViewById(R.id.bunail_title_folder);

        constraintLayout = (ConstraintLayout) view.findViewById(R.id.bunail_page1);
         Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.one_sec_transition);

        videoView = (VideoView) view.findViewById(R.id.bunail_video);

        videoView.setBackgroundColor(Color.TRANSPARENT);

        final Uri uri = Uri.parse(videopath);

        videoView.setVideoURI(uri);

        videoView.requestFocus();
        videoView.setZOrderOnTop(true);

        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                mp.setLooping(true);
            }
        });
*/


/*

        int width = getResources().getConfiguration().screenWidthDp;
        DisplayMetrics metrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);


        int density = getResources().getDisplayMetrics().densityDpi;
        // smaller device

        switch (density) {
            case DisplayMetrics.DENSITY_LOW:
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-ldpi/bunail_page2_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_MEDIUM:

                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-mdpi/bunail_page2_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_HIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-hdpi/bunail_page2_image6.png").into(image6);

                break;

            case DisplayMetrics.DENSITY_XHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xhdpi/bunail_page2_image6.png").into(image6);


                break;

            case DisplayMetrics.DENSITY_XXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxhdpi/bunail_page2_image6.png").into(image6);


                break;

            case DisplayMetrics.DENSITY_XXXHIGH:
                //       Toast.makeText(getActivity(),"MEdium", Toast.LENGTH_LONG).show();
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_background.png").into(image_background);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_header.png").into(image_header);

                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image1.png").into(image1);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image2.png").into(image2);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image3.png").into(image3);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image4.png").into(image4);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image5.png").into(image5);
                Picasso.get().load("http://work.boschpharmaceutical.com/working/images/penicillin/Speciality_April_2021/bunail/drawable-xxxhdpi/bunail_page2_image6.png").into(image6);


                break;
        }


*/
        val animation_background = AnimationUtils.loadAnimation(context, R.anim.fade_in_one_sec)
        val animation_image1 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_one_sec)
        val animation_image2 = AnimationUtils.loadAnimation(context, R.anim.zoom_in_two_sec)
        val animation_image3 = AnimationUtils.loadAnimation(context, R.anim.blink_half_sec)
        val animation_image4 = AnimationUtils.loadAnimation(context, R.anim.blink_one_sec)
        image_background!!.startAnimation(animation_background)
        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        return view
    }
}