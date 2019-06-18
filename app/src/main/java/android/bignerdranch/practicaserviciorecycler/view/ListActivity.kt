package android.bignerdranch.practicaserviciorecycler.view

import android.bignerdranch.practicaserviciorecycler.data.model.Result
import android.os.Bundle
import androidx.fragment.app.Fragment

class ListActivity : SingleFragmentActivity(){

    override fun createFragment(): Fragment {
        return ListFragment.crearFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lista=intent.getParcelableArrayListExtra<Result>("LLAVE")

        lista
    }
}