package com.pratiksha.tmdbclient.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pratiksha.tmdbclient.databinding.MainFragmentBinding
import com.pratiksha.tmdbclient.domain.SearchMovieUseCase
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding

    @Inject
    lateinit var searchMovieUseCase: SearchMovieUseCase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory(searchMovieUseCase)
        ).get(MainViewModel::class.java)

        viewModel.searchMovies("12b040ea4215e4f62b45cfa8f6be9c9c", "Fox", 1)
        viewModel.liveMovieData.observe(viewLifecycleOwner, Observer { movieData ->
            Log.d("TAG", "onViewCreated: Response = $movieData")

        })
    }

}