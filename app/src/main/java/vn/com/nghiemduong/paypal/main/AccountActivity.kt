package vn.com.nghiemduong.paypal.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_account.*
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.adapter.MisAdapter
import vn.com.nghiemduong.paypal.databinding.ActivityAccountBinding
import vn.com.nghiemduong.paypal.model.Mis

class AccountActivity : AppCompatActivity() {

    private lateinit var mMisAdapter: MisAdapter
    private lateinit var mListMiss: MutableList<Mis>
    private lateinit var binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccountBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tb.setNavigationOnClickListener { onBackPressed() }

        addLisMiss()
    }

    private fun addLisMiss() {
        mListMiss = mutableListOf(
            //Mis(R.drawable.mastercard_2, "Mastercard", "****9889"),
            Mis(R.drawable.combined_shape, "Visa black", "****8764"),
            Mis(R.drawable.combined_shape_copy, "Visa black", "****8764")
        )

        mMisAdapter = MisAdapter(mListMiss)
        setUpdateRcvMis()
    }

    private fun setUpdateRcvMis() {
        binding.rcvMis.setHasFixedSize(true)
        binding.rcvMis.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rcvMis.adapter = mMisAdapter
    }
}