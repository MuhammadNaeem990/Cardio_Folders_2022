package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductK_Animated_Fragments

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.VideoView
import app.folder.example.dell.Cardio_Folder_2022.R

class ProductK_Fragment_page_One : Fragment() {
    var videoView: VideoView? = null
    var relativeLayout: RelativeLayout? = null
    var constraintLayout: ConstraintLayout? = null
   // var videopath = "android.resource://app.folder.example.dell.Speciality_March_Folder_2021/" + R.raw.cilapen_xdr_title
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.product_k_fragment_page_1, container, false)

        // constraintLayout = (ConstraintLayout) view.findViewById(R.id.cilapen_xdr_page1);
        //   image1 = (ImageView) view.findViewById(R.id.cilapen_xdr_page1);

        //  Animation animation_page1 = AnimationUtils.loadAnimation(getContext(), R.anim.two_sec_transition);
        //relativeLayout.startAnimation(animation_page1);
       /* videoView = view.findViewById<View>(R.id.cilapen_xdr_video) as VideoView
        videoView!!.setBackgroundColor(Color.WHITE)
        val uri = Uri.parse(videopath)
        videoView!!.setVideoURI(uri)
        videoView!!.requestFocus()
        videoView!!.setZOrderOnTop(true)
        videoView!!.start()
        videoView!!.setOnPreparedListener { mp -> mp.isLooping = true }*/
        return view
    }
}