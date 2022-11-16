package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductB_Animated_Fragments

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
class ProductB_Fragment_page_One : Fragment() {
    var image1: ImageView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var mediaController: MediaController? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_b_fragment_page_1, container, false)

        // image1 = (ImageView) view.findViewById(R.id.bunail_page1_background);
       /* val path = "android.resource://"+ requireActivity().packageName + "/" + R.raw.aaram_title_video

        val uri = Uri.parse(path)

        val videoView = view.findViewById<View>(R.id.aaram_video) as VideoView

        with(videoView)
        {
            setBackgroundColor(Color.TRANSPARENT)
            setVideoURI(uri)
            requestFocus()
            setZOrderOnTop(true)
            setOnPreparedListener { mp -> mp.isLooping = true }
            start()
        }*/
        return view
    }
}