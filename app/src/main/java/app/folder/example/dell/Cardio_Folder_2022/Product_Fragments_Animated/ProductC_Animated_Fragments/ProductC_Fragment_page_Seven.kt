package app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductC_Animated_Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.R

/**
 * A simple [Fragment] subclass.
 */
class ProductC_Fragment_page_Seven : Fragment() {
    var touch = 0

    var image: ImageView? = null
    var image1: ImageView? = null
    var image2: ImageView? = null
    var image3: ImageView? = null
    var image4: ImageView? = null
    var image5: ImageView? = null
    var image6: ImageView? = null
    var image8: ImageView? = null
    var image7: ImageView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.product_c_fragment_page_7, container, false)

       /* image1 = view.findViewById<View>(R.id.qpro_id_page7_image1) as ImageView
        image2 = view.findViewById<View>(R.id.qpro_id_page7_image2) as ImageView
        image3 = view.findViewById<View>(R.id.qpro_id_page7_image3) as ImageView
        image4 = view.findViewById<View>(R.id.qpro_id_page7_image4) as ImageView
        image5 = view.findViewById<View>(R.id.qpro_id_page7_image5) as ImageView
        image6 = view.findViewById<View>(R.id.qpro_id_page7_image6) as ImageView

        val animationImage1 = AnimationUtils.loadAnimation(
            context, R.anim.slide_from_left_one_sec
        )
        val animationImage2 = AnimationUtils.loadAnimation(
            context, R.anim.zoom_in_one_sec
        )
        val animationImage3 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_one_sec
        )
        val animationImage4 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_one_n_half_second
        )
        val animationImage5 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_two_second
        )
        val animationImage6 = AnimationUtils.loadAnimation(
            context, R.anim.move_up_two_and_half_sec
        )

        image1!!.startAnimation(animationImage1)
        image2!!.startAnimation(animationImage2)
        image3!!.startAnimation(animationImage3)
        image4!!.startAnimation(animationImage4)
        image5!!.startAnimation(animationImage5)
        image6!!.startAnimation(animationImage6)*/

        return view
    }
}