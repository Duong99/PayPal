package vn.com.nghiemduong.paypal.adapter

import android.content.res.ColorStateList
import android.content.res.ColorStateList.*
import android.graphics.Color
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.model.Actividad

class ActividadAdapter(var mListActividad: MutableList<Actividad>) :
    RecyclerView.Adapter<ActividadAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_rcv_actividad, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mListActividad.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val actividad = mListActividad[position]
        actividad.let {
            holder.tvBottom.text = it.titleBottom
            holder.tvDola.text = it.dola.toString() + "€"

            if (it.dola > 0) {
                holder.tvDola.setTextColor(valueOf(Color.GREEN))
            }
            holder.tvTop.text = it.titleTop
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTop: TextView = itemView.findViewById(R.id.tvTop)
        var tvBottom: TextView = itemView.findViewById(R.id.tvBottom)
        var tvDola: TextView = itemView.findViewById(R.id.tvDola)
    }
}