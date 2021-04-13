package vn.com.nghiemduong.paypal.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun replaceFragmentNoStack(fragmentManager: FragmentManager, fragment: Fragment, frameId: Int) {
    fragmentManager.beginTransaction().replace(frameId, fragment).commit()
}