package com.marisa.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marisa.bancomr.databinding.ActivityFaturasBinding

class Faturas : AppCompatActivity() {

    private lateinit var binding: ActivityFaturasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturasBinding.inflate(layoutInflater)
        setContentView(binding.root)



        supportActionBar!!.hide()

        val toolbar = binding.toolbarFaturas
        toolbar.title = "Fatura"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(300, 0, 300, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}