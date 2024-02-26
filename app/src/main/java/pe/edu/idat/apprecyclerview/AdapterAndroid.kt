package pe.edu.idat.apprecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerview.databinding.ItemAndroidBinding

class AdapterAndroid (val listAndroid: List<Android>, val context: Context)
    : RecyclerView.Adapter<AdapterAndroid.ViewHolder>(){

    inner class ViewHolder(val binding: ItemAndroidBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int = listAndroid.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listAndroid[position]){
                binding.tvNomVersion.text = nombre
                binding.tvNumVersion.text = version
                binding.ivAndroid.setImageResource(img)
                binding.cvAndroid.setOnClickListener(View.OnClickListener {
                    Toast.makeText(
                        context,
                        "Click Item Android $nombre",
                        Toast.LENGTH_LONG).show()
                })
            }
        }
    }
}