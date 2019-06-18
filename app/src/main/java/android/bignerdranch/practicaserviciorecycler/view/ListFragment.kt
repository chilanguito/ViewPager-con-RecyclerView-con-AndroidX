package android.bignerdranch.practicaserviciorecycler.view

import android.bignerdranch.practicaserviciorecycler.R
import android.bignerdranch.practicaserviciorecycler.data.model.Result
import android.bignerdranch.practicaserviciorecycler.presenter.PresenterClas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListFragment : Fragment(){

    private lateinit var lista: ArrayList<Result>
    private lateinit var adapterList: AdapterList
    private lateinit var recyclerView: RecyclerView

companion object{
    fun crearFragment(): ListFragment{
        return ListFragment()
    }
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lista= PresenterClas.invocarGet()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val vista = inflater.inflate(R.layout.fragment_list,container,false)

        recyclerView=vista.findViewById(R.id.recycler_view)

        recyclerView.layoutManager=LinearLayoutManager(this.context)


            lista=PresenterClas.list


        adapterList= AdapterList(lista)

        recyclerView.adapter= adapterList

        return vista
    }


}