package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.graphics.Color
import android.net.Uri
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
class ProductA_Fragment_page_One : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var mediaController: MediaController? = null
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var image_background: ImageView? = null

    //var videopath = "android.resource://app.folder.example.dell.Challenger_Folder_2022/" + R.raw.qumic_april_2022

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_1, container, false)

        //image_background = view.findViewById<View>(R.id.zelinz_title_folder) as ImageView

        val path = "android.resource://"+ requireActivity().packageName + "/" + R.raw.boschempa_title_video

        val uri = Uri.parse(path)

        val videoView = view.findViewById<View>(R.id.boschempa_video) as VideoView

        with(videoView)
        {
            setBackgroundColor(Color.TRANSPARENT)
            setVideoURI(uri)
            requestFocus()
            setZOrderOnTop(true)
            setOnPreparedListener { mp -> mp.isLooping = true }
            start()
        }

        return view
    }
}