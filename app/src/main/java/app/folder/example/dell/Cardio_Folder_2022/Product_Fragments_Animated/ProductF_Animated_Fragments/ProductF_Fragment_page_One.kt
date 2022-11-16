package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductF_Animated_Fragments

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
class ProductF_Fragment_page_One : Fragment() {
    var relativeLayout: RelativeLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null
    var constraintLayout: ConstraintLayout? = null

    // String videopath = "android.resource://app.folder.example.dell.Aggressive_Folder_Third_2020/" + R.raw.zezot_title_video_november_2020;
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image_background: ImageView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_f_fragment_page_1, container, false)

        image_background = view.findViewById<View>(R.id.ticozid_title_folder) as ImageView


        /*  constraintLayout = (ConstraintLayout) view.findViewById(R.id.zezot_page1);
        videoView = (VideoView) view.findViewById(R.id.zezot_video);

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

        return view
    }
}