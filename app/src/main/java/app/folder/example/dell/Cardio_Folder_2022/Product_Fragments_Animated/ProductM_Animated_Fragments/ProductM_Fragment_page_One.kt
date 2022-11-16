package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductM_Animated_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductM_Fragment_page_One : Fragment() {
    var image1: ImageView? = null
    var image0: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var mediaController: MediaController? = null
    var videoView: VideoView? = null
    var constraintLayout: ConstraintLayout? = null

    //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
    //var videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.boschofen_title_video_april_2021

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_m_fragment_page_1, container, false)
       /* constraintLayout = view.findViewById<View>(R.id.boschofen_page1) as ConstraintLayout
        videoView = view.findViewById<View>(R.id.boschofen_video) as VideoView
        videoView!!.setBackgroundColor(Color.TRANSPARENT)
        val uri = Uri.parse(videopath)
        videoView!!.setVideoURI(uri)
        // videoView.layout(800, 1253, 800, 1253);
        videoView!!.requestFocus()
        videoView!!.setZOrderOnTop(true)
        videoView!!.start()
        videoView!!.setOnPreparedListener { mp -> mp.isLooping = true }*/
        return view
    }
}