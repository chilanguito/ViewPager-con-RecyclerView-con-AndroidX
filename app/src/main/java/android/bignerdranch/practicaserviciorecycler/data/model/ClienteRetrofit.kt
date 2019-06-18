package android.bignerdranch.practicaserviciorecycler.data.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClienteRetrofit {
    fun crearClienteRetrofit():ApiServiceGet{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.datos.gob.mx/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiServiceGet::class.java)
    }
}