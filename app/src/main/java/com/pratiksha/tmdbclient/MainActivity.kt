package com.pratiksha.tmdbclient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pratiksha.tmdbclient.databinding.MainActivityBinding
import com.pratiksha.tmdbclient.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate( layoutInflater )

        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}