package com.vikas.paginationjetpack.util

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

open class Utils {
    fun View.visible(isVisible: Boolean) {
        visibility = if (isVisible) View.VISIBLE else View.GONE
    }


}