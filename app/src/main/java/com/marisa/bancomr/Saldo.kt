package com.marisa.bancomr

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.marisa.bancomr.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {
    private lateinit var binding: ActivitySaldoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val toolbar =binding.toolbarSaldo
        toolbar.title ="Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(300,0,300,0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}