package com.example.restaurantreview2

import retrofit2.Call
import retrofit2.http.*


//merupakan interface yang berisi endpoint
interface ApiService {

    //metode untuk mengambil data
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<RestaurantResponse>


    //metode untuk mengirim data
    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")

    fun postReview(

        @Field("id") id : String,
        @Field("name") name : String,
        @Field("review") review : String,
    ): Call<PostReviewResponse>
}