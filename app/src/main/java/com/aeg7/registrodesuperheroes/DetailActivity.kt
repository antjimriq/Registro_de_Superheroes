  package com.aeg7.registrodesuperheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aeg7.registrodesuperheroes.databinding.ActivityDetailBinding

  class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle= intent.extras!!
        val superheroName=bundle.getString("superhero_name") ?:""
        val alterEgo=bundle.getString("alter_ego") ?:""
        val bio= bundle.getString("bio") ?:""
        val power= bundle.getFloat("power")
        binding.heroName.text=superheroName
        binding.alterego.text=alterEgo
        binding.biotext.text=bio
        binding.ratingBar.rating=power
    }
}