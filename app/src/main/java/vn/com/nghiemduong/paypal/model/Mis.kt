package vn.com.nghiemduong.paypal.model

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter

class Mis(var image: Int, var nameBank: String, var numberBank: String) {

}

@BindingAdapter("android:imageUrl")
fun loadImage(view: ImageView, image: Int) {
    val iv = view
    iv.setBackgroundResource(image)
}