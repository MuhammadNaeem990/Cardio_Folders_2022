package app.folder.example.dell.Cardio_Folder_2022.Adapter_Animated

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductK_Animated_Fragments.ProductK_Fragment_page_One
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductK_Animated_Fragments.ProductK_Fragment_page_Two

class ProductK_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    //int count = 0;
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductK_Fragment_page_One()
            1 -> return ProductK_Fragment_page_Two()
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
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}