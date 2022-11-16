package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductD_Animated_Fragments

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
class ProductD_Fragment_page_One  //  String video = "android.resource://app.folder.example.dell.Agg_First_Folder_2020/" + R.raw.calamox_title_video_2020;
//  String videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.cilapen_title_video_jan_2021;
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
        val view = inflater.inflate(R.layout.product_d_fragment_page_1, container, false)

       /* val path = "android.resource://"+ requireActivity().packageName + "/" + R.raw.linzox_title_feb_2020

        val uri = Uri.parse(path)

        val videoView = view.findViewById<View>(R.id.linzox_video) as VideoView

        with(videoView)
        {
            setBackgroundColor(Color.TRANSPARENT)
            setVideoURI(uri)
            requestFocus()
            setZOrderOnTop(true)
            setOnPreparedListener { mp -> mp.isLooping = true }
            start()
        }
*/
return view
    }
}