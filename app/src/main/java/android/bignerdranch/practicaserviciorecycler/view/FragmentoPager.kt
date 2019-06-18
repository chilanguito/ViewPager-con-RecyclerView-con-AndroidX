package android.bignerdranch.practicaserviciorecycler.view

import android.bignerdranch.practicaserviciorecycler.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentoPager : Fragment() {

    companion object{
        fun newInstance():FragmentoPager{
            return FragmentoPager()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       return inflater.inflate(R.layout.item_fragment_pager,container,false)
    }
}