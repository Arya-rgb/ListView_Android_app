package com.thorin.training.submissiondicky


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListLaptopAdapter(private val listlaptop: ArrayList<Laptop>) : RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_laptop, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listlaptop.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail,photo ) = listlaptop[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvType.text = name
        holder.tvDetail.text = detail

        val sLaptop = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveSpec = Intent(sLaptop, detail_laptop::class.java)
            moveSpec.putExtra(detail_laptop.EXTRA_NAME, name)
            moveSpec.putExtra(detail_laptop.EXTRA_DETAIL, detail)
            moveSpec.putExtra(detail_laptop.EXTRA_PHOTO, photo)
            sLaptop.startActivity(moveSpec)
        }

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvType: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}


