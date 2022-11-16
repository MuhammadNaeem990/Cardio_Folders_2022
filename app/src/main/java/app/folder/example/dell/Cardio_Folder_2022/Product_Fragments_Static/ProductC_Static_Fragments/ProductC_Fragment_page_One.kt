package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductC_Static_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductC_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Aggressive_Folder_Third_2020/" + R.raw.bofalgan_title_video_november_2020;
    : Fragment() {
    var image0: ImageView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        /* constraintLayout = (ConstraintLayout) view.findViewById(R.id.bofalgan_page1);
        // Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.one_sec_transition);

     //   Animation animation_page1 = AnimationUtils.loadAnimation(getContext(), R.anim.two_sec_transition);
//        relativeLayout.startAnimation(animation_page1);

        videoView = (VideoView) view.findViewById(R.id.bofalgon_videoview_page1);

        videoView.setBackgroundColor(Color.TRANSPARENT);

        final Uri uri = Uri.parse(video);

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
*/return inflater.inflate(R.layout.product_c_fragment_page_1, container, false)
    }
}