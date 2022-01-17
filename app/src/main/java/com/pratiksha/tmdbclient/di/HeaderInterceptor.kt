package com.pratiksha.tmdbclient.di

import okhttp3.Interceptor
import okhttp3.Response

//TODO: fix issue with api key
class HeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
            .newBuilder().addHeader("api_key", "12b040ea4215e4f62b45cfa8f6be9c9c").build()
        return chain.proceed(request)
    }
}