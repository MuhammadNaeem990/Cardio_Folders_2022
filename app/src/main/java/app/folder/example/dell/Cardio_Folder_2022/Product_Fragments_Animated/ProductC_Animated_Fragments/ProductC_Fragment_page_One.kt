package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductC_Animated_Fragments

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
class ProductC_Fragment_page_One : Fragment() {
    var image1: ImageView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
    var videoView: VideoView? = null
    var videoView2: VideoView? = null
    var mediaController: MediaController? = null
    //var video = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.zolrest_title_video_july_2021

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_1, container, false)

        val path = "android.resource://"+ requireActivity().packageName + "/" + R.raw.caloc_video

        val uri = Uri.parse(path)

        val videoView = view.findViewById<View>(R.id.caloc_video) as VideoView

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