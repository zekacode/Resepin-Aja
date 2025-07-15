// file: data/remote/MealApiService.kt
package com.wyynnn.resepinaja.data.remote

import com.wyynnn.resepinaja.data.remote.dto.CategoriesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApiService {

    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse

    // Nanti kita akan tambahkan fungsi untuk getMealsByCategory dan getMealDetail di sini
}