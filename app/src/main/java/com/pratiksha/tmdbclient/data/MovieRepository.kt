package com.pratiksha.tmdbclient.data

import javax.inject.Inject

class MovieRepository @Inject constructor(private val tmDbMovieService: TMDbMovieService) {

    suspend fun searchMovie(apiKey: String, query: String, page: Int): List<MovieData> {
        val resultSet: ResultSet = tmDbMovieService.searchMovie(apiKey, query, page)
        return resultSet.results
    }

}
