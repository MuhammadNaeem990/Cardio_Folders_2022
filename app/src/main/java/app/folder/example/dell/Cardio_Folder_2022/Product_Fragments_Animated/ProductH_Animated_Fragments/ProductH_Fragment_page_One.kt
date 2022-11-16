package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductH_Animated_Fragments

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
class ProductH_Fragment_page_One : Fragment() {
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null
    //var videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.penro_title_video_march_2021

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_h_fragment_page_1, container, false)

      /*  constraintLayout = view.findViewById<View>(R.id.penro_page1) as ConstraintLayout
        // Animation animation_image1 = AnimationUtils.loadAnimation(getContext(), R.anim.one_sec_transition);

        *//*  Animation animation_page1 = AnimationUtils.loadAnimation(getContext(), R.anim.two_sec_transition);
        relativeLayout.startAnimation(animation_page1);
*//*videoView = view.findViewById<View>(R.id.penro_video) as VideoView
        videoView!!.setBackgroundColor(Color.TRANSPARENT)
        val uri = Uri.parse(videopath)
        videoView!!.setVideoURI(uri)
        videoView!!.requestFocus()
        videoView!!.setZOrderOnTop(true)
        videoView!!.start()
        videoView!!.setOnPreparedListener { mp -> mp.isLooping = true }*/

        return view
    }
}