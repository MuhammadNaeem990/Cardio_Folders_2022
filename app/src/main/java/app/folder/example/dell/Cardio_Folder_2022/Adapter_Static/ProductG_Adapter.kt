package app.folder.example.dell.Cardio_Folder_2022.Adapter_Static

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductG_Static_Fragments.*

class ProductG_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductG_Fragment_page_One()
            1 -> return ProductG_Fragment_page_Two()
            2 -> return ProductG_Fragment_page_Three()
            3 -> return ProductG_Fragment_page_Four()
            4 -> return ProductG_Fragment_page_Five()
            5 -> return ProductG_Fragment_page_Six()
            6 -> return ProductG_Fragment_page_Seven()
            7 -> return ProductG_Fragment_page_Eight()
            8 -> return ProductG_Fragment_page_Nine()
            9 -> return ProductG_Fragment_page_Ten()
            10 -> return ProductG_Fragment_page_Eleven()
        }
        return null
    }

    override fun getCount(): Int {
        return 11
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Page 1"
            1 -> return "Page 2"
            2 -> return "Page 3"
            3 -> return "Page 4"
            4 -> return "Page 5"
            5 -> return "Page 6"
            6 -> return "Page 7"
            7 -> return "Page 8"
            8 -> return "Page 9"
            9 -> return "Page 10"
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}