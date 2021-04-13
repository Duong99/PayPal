package vn.com.nghiemduong.paypal.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pay_pal.*
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.adapter.EnviarAdapter
import vn.com.nghiemduong.paypal.fragment.PayPalFragment
import vn.com.nghiemduong.paypal.model.Enviar
import vn.com.nghiemduong.paypal.utils.replaceFragmentNoStack

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragmentNoStack(
            supportFragmentManager, PayPalFragment(),
            R.id.frameMain
        )

        navMain.background = null
        navMain.menu.getItem(1).isEnabled = false


        navMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item_enviar -> replaceFragmentNoStack(
                    supportFragmentManager, PayPalFragment(),
                    R.id.frameMain
                )
                R.id.item_prefit -> replaceFragmentNoStack(
                    supportFragmentManager, PayPalFragment(),
                    R.id.frameMain
                )
            }
            return@setOnNavigationItemSelectedListener true
        }

        fabRecibir.setOnClickListener {
            replaceFragmentNoStack(
                supportFragmentManager, PayPalFragment(),
                R.id.frameMain
            )
        }
    }
}