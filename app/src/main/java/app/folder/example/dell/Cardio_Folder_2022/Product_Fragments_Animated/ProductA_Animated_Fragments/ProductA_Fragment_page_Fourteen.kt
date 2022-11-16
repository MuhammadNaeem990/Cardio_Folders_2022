package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductA_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R


class ProductA_Fragment_page_Fourteen : Fragment() {
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image7: ImageView? = null
    var image8: ImageView? = null
    var qzone_shine1: ImageView? = null
    var qzone_shine2: ImageView? = null
    var qzone_shine3: ImageView? = null
    var touch: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_a_fragment_page_14, container, false)



        return view
    }
}