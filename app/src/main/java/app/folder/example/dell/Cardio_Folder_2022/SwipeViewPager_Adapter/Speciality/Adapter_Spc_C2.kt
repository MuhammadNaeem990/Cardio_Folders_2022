package app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Adapter.Speciality

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import app.folder.example.dell.Cardio_Folder_2022.R
import android.widget.TextView
import android.content.Intent
import android.view.View
import android.widget.ImageView
import app.folder.example.dell.Cardio_Folder_2022.Activities_Animated.ProductG_Activity
import app.folder.example.dell.Cardio_Folder_2022.Activities_Animated.ProductH_Activity
import app.folder.example.dell.Cardio_Folder_2022.Activities_Animated.ProductI_Activity
import app.folder.example.dell.Cardio_Folder_2022.SwipeViewPager_Activities.Model

class Adapter_Spc_C2(private val models: List<Model>, private val context: Context) :
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
        val view = layoutInflater?.inflate(R.layout.item, container, false)
        val imageView: ImageView
        val imageView1: ImageView
        var title: TextView
        var desc: TextView
        imageView = view!!.findViewById(R.id.image)
        imageView1 = view.findViewById(R.id.image1)
        /*title = view.findViewById(R.id.title);
        desc = view.findViewById(R.id.desc);*/imageView.setImageResource(models[position].image)
        imageView1.setImageResource(models[position].image1)
        /* title.setText(models.get(position).getTitle());
        desc.setText(models.get(position).getDesc());*/


        //onclicklistener
        imageView.setOnClickListener { /*             if (position == 0) {
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                }
                else if (position == 1)
                {
                    Intent intent = new Intent(context, ProductB_Activity.class);
                    context.startActivity(intent);
                }

                else if (position == 2)
                {
                    Intent intent = new Intent(context, ProductC_Activity.class);
                    context.startActivity(intent);
                }
                else if(position == 3)
                {
                    Intent intent = new Intent(context, ProductD_Activity.class);
                    context.startActivity(intent);
                }
                else if(position == 4)
                {
                    Intent intent = new Intent(context, ProductK_Activity.class);
                    context.startActivity(intent);
                }else if(position == 5)
                {
                    Intent intent = new Intent(context, ProductE_Activity.class);
                    context.startActivity(intent);
                }
                else if(position == 6)
                {
                    Intent intent = new Intent(context, ProductJ_Activity.class);
                    context.startActivity(intent);
                }
                else if(position == 7)
                {
                    Intent intent = new Intent(context, ProductF_Activity.class);
                    context.startActivity(intent);
                }*/
            if (position == 0) {
                val intent = Intent(context, ProductH_Activity::class.java)
                context.startActivity(intent)
            } else if (position == 1) {
                val intent = Intent(context, ProductI_Activity::class.java)
                context.startActivity(intent)
            } else {
                val intent = Intent(context, ProductG_Activity::class.java)
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