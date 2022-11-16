package app.folder.example.dell.Cardio_Folder_2022.Adapter_Static

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import app.folder.example.dell.Cardio_Folder_2022.Product_Fragments_Static.ProductC_Static_Fragments.*

class ProductC_Adapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ProductC_Fragment_page_One()
            1 -> return ProductC_Fragment_page_Two()
            2 -> return ProductC_Fragment_page_Three()
            3 -> return ProductC_Fragment_page_Four()
            4 -> return ProductC_Fragment_page_Five()
            5 -> return ProductC_Fragment_page_Six()
            6 -> return ProductC_Fragment_page_Seven()
            7 -> return ProductC_Fragment_page_Eight()
            8 -> return ProductC_Fragment_page_Nine()
            9 -> return ProductC_Fragment_page_Ten()
        }
        return null
    }

    override fun getCount(): Int {
        return 10
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
        }
        return null
    }

    override fun getItemPosition(`object`: Any): Int {
        return POSITION_NONE
    }
}