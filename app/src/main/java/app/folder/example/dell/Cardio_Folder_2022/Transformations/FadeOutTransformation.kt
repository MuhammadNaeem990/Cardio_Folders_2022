package app.folder.example.dell.Cardio_Folder_2022.Transformations

import android.support.v4.view.ViewPager.PageTransformer
import android.view.View

class FadeOutTransformation : PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.translationX = -position * page.width
        page.alpha = 1 - Math.abs(position)
    }
}