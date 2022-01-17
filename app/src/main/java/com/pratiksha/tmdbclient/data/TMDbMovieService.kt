package com.pratiksha.tmdbclient.data

import retrofit2.http.GET
import retrofit2.http.Query

interface TMDbMovieService {
    @GET("search/movie")
    suspend fun searchMovie(
        @Query("api_key") apiKey: String,
        @Query("query") query: String,
        @Query("page") page: Int
    ): ResultSet
}