package android.bignerdranch.practicaserviciorecycler.data.model

import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceGet {
    @GET("/v1/api-catalog")
    fun crearApiService(): Call<ModelApiServiceGet>
}