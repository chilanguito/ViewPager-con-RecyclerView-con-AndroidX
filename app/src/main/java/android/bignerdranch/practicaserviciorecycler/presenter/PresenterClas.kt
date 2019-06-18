@file:Suppress("UNREACHABLE_CODE")

package android.bignerdranch.practicaserviciorecycler.presenter

import android.bignerdranch.practicaserviciorecycler.data.model.ClienteRetrofit
import android.bignerdranch.practicaserviciorecycler.data.model.ModelApiServiceGet
import android.bignerdranch.practicaserviciorecycler.data.model.Result
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object PresenterClas {

    var list:ArrayList<Result> = arrayListOf()

    fun invocarGet():ArrayList<Result>{

        var peticion= false
       val api= ClienteRetrofit.crearClienteRetrofit()
        val call= api.crearApiService()
        call.enqueue(object : Callback<ModelApiServiceGet> {
            override fun onFailure(call: Call<ModelApiServiceGet>, t: Throwable) {
                Log.e("ERROR",t.message)
            }

            override fun onResponse(call: Call<ModelApiServiceGet>, response: Response<ModelApiServiceGet>) {
               if (response.isSuccessful){
                   peticion=true
               }
                Log.d("RESPONSE",response.body().toString())
                 list=response.body()?.results!!

            }
        })

        return list


    }
}