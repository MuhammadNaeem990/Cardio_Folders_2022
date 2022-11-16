package app.folder.example.dell.Cardio_Folder_2022.Transformations

import android.support.v4.view.ViewPager.PageTransformer
import android.view.View

class PopTransformation : PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.translationX = -position * page.width
        if (Math.abs(position) < 0.5) {
            page.visibility = View.VISIBLE
            page.scaleX = 1 - Math.abs(position)
            page.scaleY = 1 - Math.abs(position)
        } else if (Math.abs(position) > 0.5) {
            page.visibility = View.GONE
        }
    }
}