package com.example.inflearn_viewmodel_share

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.inflearn_viewmodel_share.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel: MainViewModel by viewModels()

        binding.btnMinus.setOnClickListener {
            viewModel.minus()
            binding.tvCount.text = viewModel.countValue.toString()
        }

        binding.btnPlus.setOnClickListener {
            viewModel.plus()
            binding.tvCount.text = viewModel.countValue.toString()
        }

        binding.btnShowFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.flMain, TestFragment()).commit()
        }

    }
}