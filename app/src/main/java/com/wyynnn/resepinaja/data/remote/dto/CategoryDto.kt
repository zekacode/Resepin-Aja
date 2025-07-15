// file: data/remote/dto/CategoryDto.kt
package com.wyynnn.resepinaja.data.remote.dto

import com.squareup.moshi.Json

// Ini adalah data class untuk menampung seluruh respons dari API kategori
data class CategoriesResponse(
    @field:Json(name = "categories")
    val categories: List<CategoryDto>
)

// Ini adalah data class untuk satu item kategori
data class CategoryDto(
    @field:Json(name = "idCategory")
    val id: String,

    @field:Json(name = "strCategory")
    val name: String,

    @field:Json(name = "strCategoryThumb")
    val thumbnail: String,

    @field:Json(name = "strCategoryDescription")
    val description: String
)