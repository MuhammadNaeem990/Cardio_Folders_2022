package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductG_Static_Fragments

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
class ProductG_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
//  String videopath = "android.resource://app.folder.example.dell.Aggressive_Folder_Third_2020/" + R.raw.calamox_c_vial_title_video_november_2020;
    : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var mediaController: MediaController? = null
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        /*

        constraintLayout = (ConstraintLayout) view.findViewById(R.id.calamox_c_page1);
        videoView = (VideoView) view.findViewById(R.id.calamox_c_video);
        videoView.setBackgroundColor(Color.TRANSPARENT);
        final Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        // videoView.layout(800, 1253, 800, 1253);
        videoView.requestFocus();
        videoView.setZOrderOnTop(true);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
*/return inflater.inflate(R.layout.product_g_fragment_page_1, container, false)
    }
}