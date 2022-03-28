package borboa.andrea.reel_proyectomoviles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter (private var images:IntArray): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image :ImageView =itemView.findViewById(R.id.imageItem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val imagenView = inflater.inflate(R.layout.promos_item,parent,false)
        return ViewHolder(imagenView)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return images.size
    }


}