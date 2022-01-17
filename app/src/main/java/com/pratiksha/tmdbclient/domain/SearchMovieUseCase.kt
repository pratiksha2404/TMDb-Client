package com.pratiksha.tmdbclient.domain

import com.pratiksha.tmdbclient.data.MovieRepository
import com.pratiksha.tmdbclient.data.MovieData
import javax.inject.Inject

class SearchMovieUseCase @Inject constructor(private val repository: MovieRepository) {

    suspend fun execute(apiKey: String, query: String, page: Int): List<MovieData>
    {
        return repository.searchMovie(apiKey, query, page)
    }
}