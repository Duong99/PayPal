package vn.com.nghiemduong.paypal.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_consider.*
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.databinding.ActivityConsiderBinding

class ConsiderActivity : AppCompatActivity() {
    lateinit var binding: ActivityConsiderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConsiderBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tb.setNavigationOnClickListener { onBackPressed() }
    }
}