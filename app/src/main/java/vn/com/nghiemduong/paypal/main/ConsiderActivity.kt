package vn.com.nghiemduong.paypal.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_consider.*
import vn.com.nghiemduong.paypal.R

class ConsiderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consider)

        tb.setNavigationOnClickListener { onBackPressed() }
    }
}