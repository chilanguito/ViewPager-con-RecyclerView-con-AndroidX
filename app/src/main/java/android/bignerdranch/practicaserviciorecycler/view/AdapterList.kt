package android.bignerdranch.practicaserviciorecycler.view

import android.bignerdranch.practicaserviciorecycler.R
import android.bignerdranch.practicaserviciorecycler.data.model.Result
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterList(var lista: ArrayList<Result>) : RecyclerView.Adapter<AdapterList.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista= LayoutInflater.from(parent.context).inflate(R.layout.item_detalle,parent,false)
        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }


    inner class ViewHolder(var item:View) : RecyclerView.ViewHolder(item), View.OnClickListener{

        override fun onClick(v: View?) {
        val intent=Intent(item.context,ViewPagerActivity::class.java)
            item.context.startActivity(intent)
        }

        private lateinit var id: TextView
        private lateinit var count:TextView
        private lateinit var endpoint: TextView
        private lateinit var url:TextView
        private lateinit var variables:TextView

        fun bind(){
            item.setOnClickListener(this)
            var texto=" "
            id= item.findViewById(R.id.id)
            count= item.findViewById(R.id.count)
            endpoint= item.findViewById(R.id.endpoint)
            url = item.findViewById(R.id.url)
            variables = item.findViewById(R.id.variables)

            id.text= lista[adapterPosition]._id
            count.text = lista[adapterPosition].count.toString()
            endpoint.text=  lista[adapterPosition].endpoint
            url.text=  lista[adapterPosition].url

            for (list in lista[adapterPosition].variables){
                texto+= " \n $list"
            }

            variables.text= texto
        }

    }
}