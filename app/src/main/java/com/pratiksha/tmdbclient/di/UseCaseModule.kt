package com.pratiksha.tmdbclient.di

import com.pratiksha.tmdbclient.data.MovieRepository
import com.pratiksha.tmdbclient.domain.SearchMovieUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideSearchMovieUseCase(repository: MovieRepository): SearchMovieUseCase {
        return SearchMovieUseCase(repository)
    }
}