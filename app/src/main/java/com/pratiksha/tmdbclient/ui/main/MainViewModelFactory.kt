package com.pratiksha.tmdbclient.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pratiksha.tmdbclient.domain.SearchMovieUseCase
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val searchMovieUseCase: SearchMovieUseCase) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(searchMovieUseCase) as T
    }
}
