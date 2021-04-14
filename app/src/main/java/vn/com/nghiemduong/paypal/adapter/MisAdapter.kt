package vn.com.nghiemduong.paypal.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vn.com.nghiemduong.paypal.R
import vn.com.nghiemduong.paypal.model.Mis

class MisAdapter(var mListMiss: MutableList<Mis>) : RecyclerView.Adapter<MisAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_rcv_mis, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mListMiss.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mis = mListMiss[position]
        mis.let {
            holder.ivImage.setBackgroundResource(it.image)
            holder.tvNameBank.text = it.nameBank
            holder.tvNumberBank.text = it.numberBank
        }
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var ivImage: ImageView = itemView!!.findViewById(R.id.ivImage)
        var tvNameBank: TextView = itemView!!.findViewById(R.id.tvNameBank)
        var tvNumberBank: TextView = itemView!!.findViewById(R.id.tvNumberBank)
    }
}