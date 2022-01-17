package com.pratiksha.tmdbclient.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pratiksha.tmdbclient.data.MovieData
import com.pratiksha.tmdbclient.domain.SearchMovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val searchMovieUseCase: SearchMovieUseCase) : ViewModel() {

    val liveMovieData = MutableLiveData<List<MovieData>>()

    fun searchMovies(apiKey: String, query: String, page: Int) {

        viewModelScope.launch {
            liveMovieData.value = searchMovieUseCase.execute(apiKey, query, page)
        }
    }
}