package vn.com.nghiemduong.paypal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.model.Enviar

class EnviarAdapter(var mListEnviars: MutableList<Enviar>) :
    RecyclerView.Adapter<EnviarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_rcv_enviar, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mListEnviars.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val enviar = mListEnviars[position]
        enviar.let {
            holder.tvEnviar.text = it.title
            holder.ivEnviar.setBackgroundResource(it.image)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvEnviar: TextView = itemView.findViewById(R.id.tvEnivar)
        var ivEnviar: ImageView = itemView.findViewById(R.id.ivEnviar)
    }
}