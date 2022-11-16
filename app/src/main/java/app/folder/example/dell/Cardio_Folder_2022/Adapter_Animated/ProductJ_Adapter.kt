package app.folder.example.dell.Cardio_Folder_2022.Adapter_Animated

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductJ_Animated_Fragments.ProductJ_Fragment_page_One
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductJ_Animated_Fragments.ProductJ_Fragment_page_Two

class ProductJ_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    //int count = 0;
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductJ_Fragment_page_One()
            1 -> return ProductJ_Fragment_page_Two()
        }
        return null
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Page 1"
            1 -> return "Page 2"
            2 -> return "Page 3"
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}