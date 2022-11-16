package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductL_Animated_Fragments

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

class ProductL_Fragment_page_Twelve : Fragment() {
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null

    //  String videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.cilapen_title_video_dec_2020;
    var image0: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_l_fragment_page_12, container, false)

/*

        constraintLayout = (ConstraintLayout) view.findViewById(R.id.cilapen_page1);

        videoView = (VideoView) view.findViewById(R.id.videoview_page1);

        videoView.setBackgroundColor(Color.TRANSPARENT);

        final Uri uri = Uri.parse(videopath);

        videoView.setVideoURI(uri);

        videoView.requestFocus();
        videoView.setZOrderOnTop(true);

        videoView.start();
*/videoView!!.setOnCompletionListener {
            val fragmentTransaction = fragmentManager!!.beginTransaction()
            fragmentTransaction.replace(R.id.containerView_l, ProductL_Fragment_page_One())
                .addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }
}