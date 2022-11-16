package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductE_Animated_Fragments

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
class ProductE_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
//   String videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.cebac_title_video_dec;
    : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image_background: ImageView? = null
    var mediaController: MediaController? = null
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        // image_background = (ImageView) view.findViewById(R.id.cebac_title_folder);

        /*   constraintLayout = (ConstraintLayout) view.findViewById(R.id.cebac_page1);

        videoView = (VideoView) view.findViewById(R.id.cebac_video);
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
        });*/return inflater.inflate(R.layout.product_e_fragment_page_1, container, false)
    }
}