package app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Adapter.Speciality

import android.content.Context
import android.content.Intent
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import app.folder.example.dell.Cardio_Folder_2022.Activities_Animated.*
import app.folder.example.dell.Cardio_Folder_2022.R
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Model

class Adapter_Admin(private val models: List<Model>, private val context: Context) :
    PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    override fun getCount(): Int {
        return models.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater?.inflate(R.layout.item2, container, false)
        val imageView: ImageView
        val imageView1: ImageView
        var title: TextView
        var desc: TextView
        imageView = view!!.findViewById(R.id.image)

        imageView1 = view.findViewById(R.id.image1)
        imageView.setImageResource(models[position].image)
        imageView1.setImageResource(models[position].image1)
        imageView.setOnClickListener {
            if (position == 0) {
                val intent = Intent(context, ProductA_Activity::class.java)
                context.startActivity(intent)
            } else if (position == 1) {
                val intent = Intent(context, ProductB_Activity::class.java)
                context.startActivity(intent)
            }
        }
        container.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}