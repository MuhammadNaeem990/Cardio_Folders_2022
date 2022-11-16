package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductB_Static_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductB_Fragment_page_One  // String videopath = "android.resource://app.folder.example.dell.Aggressive_Folder_Third_2020/" + R.raw.ciplinz_title_video_june_20;
    : Fragment() {
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

        /*  constraintLayout = (ConstraintLayout) view.findViewById(R.id.ciplinz_page1);

        videoView = (VideoView) view.findViewById(R.id.ciplinz_video);

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
*/return inflater.inflate(R.layout.product_b_fragment_page_1, container, false)
    }
}