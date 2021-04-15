package vn.com.nghiemduong.paypal.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pay_pal.*
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.adapter.EnviarAdapter
import vn.com.nghiemduong.paypal.databinding.ActivityMainBinding
import vn.com.nghiemduong.paypal.fragment.PayPalFragment
import vn.com.nghiemduong.paypal.model.Enviar
import vn.com.nghiemduong.paypal.utils.replaceFragmentNoStack

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
//        actionBar?.hide()
/*        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }*/

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        replaceFragmentNoStack(
            supportFragmentManager, PayPalFragment(),
            R.id.frameMain
        )

        navMain.background = null
        navMain.menu.getItem(1).isEnabled = false


        binding.navMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item_enviar -> startActivity(Intent(this, AccountActivity::class.java))
                R.id.item_prefit -> startActivity(Intent(this, ConsiderActivity::class.java))
            }
            return@setOnNavigationItemSelectedListener true
        }

        binding.fabRecibir.setOnClickListener {
            replaceFragmentNoStack(
                supportFragmentManager, PayPalFragment(),
                R.id.frameMain
            )
        }
    }
}