package vn.com.nghiemduong.paypal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.adapter.ActividadAdapter
import vn.com.nghiemduong.paypal.adapter.EnviarAdapter
import vn.com.nghiemduong.paypal.model.Actividad
import vn.com.nghiemduong.paypal.model.Enviar

class PayPalFragment : Fragment() {

    private lateinit var mEnviarAdapter: EnviarAdapter
    private lateinit var mActividadAdapter: ActividadAdapter
    private lateinit var mListEnviars: MutableList<Enviar>
    private lateinit var mListActividads: MutableList<Actividad>
    private lateinit var mView: View
    private lateinit var rcvEnviar: RecyclerView
    private lateinit var rcvActividad: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_pay_pal, container, false)

        initView()

        addListEnviars()
        addListActividads()
        return mView

    }

    private fun addListActividads() {
        mListActividads = mutableListOf(
            Actividad("El corte inglés", "Pago aceptado", -50),
            Actividad("Maria Lujan", "Pago aceptado", 650),
            Actividad("Maria Lujan", "Pago aceptado", 250)
        )

        mActividadAdapter = ActividadAdapter(mListActividads)

        setUpRcvActividad()
    }

    private fun setUpRcvActividad() {
        rcvActividad.setHasFixedSize(true)
        rcvActividad.layoutManager = LinearLayoutManager(context)
        rcvActividad.adapter = mActividadAdapter
    }

    private fun initView() {
        rcvEnviar = mView.findViewById(R.id.rcvEnviar)
        rcvActividad = mView.findViewById(R.id.rcvActividad)
    }

    private fun addListEnviars() {
        mListEnviars = mutableListOf(
            Enviar(R.drawable.bitmap_copy, "Carlos Roca"),
            Enviar(R.drawable.bitmap_copy_3, "Ruby Sanz"),
            Enviar(R.drawable.bitmap_copy_4, "Mary Rich"),
            Enviar(R.drawable.bitmap_copy_5, "José Porto")
        )

        mEnviarAdapter = EnviarAdapter(mListEnviars)
        setUpRcvEnvivar()
    }

    private fun setUpRcvEnvivar() {
        rcvEnviar.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager =
            GridLayoutManager(context, 4, GridLayoutManager.VERTICAL, true)
        rcvEnviar.layoutManager = layoutManager
        rcvEnviar.adapter = mEnviarAdapter
    }
}