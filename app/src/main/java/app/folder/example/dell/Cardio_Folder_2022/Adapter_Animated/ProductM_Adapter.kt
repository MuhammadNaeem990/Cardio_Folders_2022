package app.folder.example.dell.Cardio_Folder_2022.Adapter_Animated

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Animated.ProductM_Animated_Fragments.*

class ProductM_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    //int count = 0;
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductM_Fragment_page_One()
            1 -> return ProductM_Fragment_page_Two()
            2 -> return ProductM_Fragment_page_Three()
            3 -> return ProductM_Fragment_page_Four()
            4 -> return ProductM_Fragment_page_Five()
            5 -> return ProductM_Fragment_page_Six()
            6 -> return ProductM_Fragment_page_Seven()
            7 -> return ProductM_Fragment_page_Eight()
            8 -> return ProductM_Fragment_page_Nine()
        }
        return null
    }

    override fun getCount(): Int {
        return 9
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