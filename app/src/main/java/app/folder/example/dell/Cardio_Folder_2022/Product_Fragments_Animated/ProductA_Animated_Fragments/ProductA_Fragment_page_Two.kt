package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductA_Fragment_page_Two

//int touch = 0;
//   VideoView videoView, videoView2;
//  MediaController mediaController;
//String videopath = "android.resource://app.folder.example.dell.indigo_folders/" + R.raw.omeprazole;

    : Fragment() {

    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null

    private lateinit var mediaPlayer: MediaPlayer
    private var start: Boolean = false
    var touch = 0

    var button_back1: Button? = null
    var button_next2: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.product_a_fragment_page_2, container, false)

        image1 = view.findViewById<View>(R.id.boschempa_id_page2_image1) as ImageView
        image2 = view.findViewById<View>(R.id.boschempa_id_page2_image2) as ImageView
        image3 = view.findViewById<View>(R.id.boschempa_id_page2_image3) as ImageView
        image4 = view.findViewById<View>(R.id.boschempa_id_page2_image4) as ImageView
        image5 = view.findViewById<View>(R.id.boschempa_id_page2_image5) as ImageView
        image6 = view.findViewById<View>(R.id.boschempa_id_page2_image6) as ImageView
        image7 = view.findViewById<View>(R.id.boschempa_id_page2_image7) as ImageView
        image8 = view.findViewById<View>(R.id.boschempa_id_page2_image8) as ImageView

        val animation_image1 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left
        )
        val animation_image2 = AnimationUtils.loadAnimation(
            context, R.anim.fade_in_two_sec
        )
        val animation_image3 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left_1400
        )
        val animation_image4 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_left_1600
        )
        val animation_image5 = AnimationUtils.loadAnimation(
            context, R.anim.move_from_right_two_seconds
        )
        val animation_image6 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animation_image7 = AnimationUtils.loadAnimation(
            context, R.anim.slide_down_one_secnd
        )
        val animation_image8 = AnimationUtils.loadAnimation(
            context, R.anim.blink
        )

        image1!!.startAnimation(animation_image1)
        image2!!.startAnimation(animation_image2)
        image3!!.startAnimation(animation_image3)
        image4!!.startAnimation(animation_image4)
        image5!!.startAnimation(animation_image5)

        image6!!.visibility = View.INVISIBLE
        image7!!.visibility = View.INVISIBLE
        image8!!.visibility = View.INVISIBLE

        val handler = Handler()
        handler.postDelayed({
            image6!!.visibility = View.VISIBLE
            image6!!.startAnimation(animation_image6)
            image7!!.visibility = View.VISIBLE
            image7!!.startAnimation(animation_image7)
            image8!!.visibility = View.VISIBLE
            image8!!.startAnimation(animation_image8)
        }, 1100)

        return view
    }
}