package com.pratiksha.tmdbclient.di

import com.pratiksha.tmdbclient.data.MovieRepository
import com.pratiksha.tmdbclient.data.TMDbMovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(tmDbMovieService: TMDbMovieService): MovieRepository{
        return MovieRepository(tmDbMovieService)
    }
}