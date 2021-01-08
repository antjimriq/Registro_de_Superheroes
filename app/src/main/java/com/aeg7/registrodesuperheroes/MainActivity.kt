package com.aeg7.registrodesuperheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aeg7.registrodesuperheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        const val SUPERHERO_KEY="superhero"
    }
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.saveButton.setOnClickListener{
            val superheroName=binding.heronameedit.text.toString()
            val alterEgo=binding.alteregoedit.text.toString()
            val bio=binding.bioText.text.toString()
            val power=binding.ratingbar.rating
            openDetailActivity(superheroName,alterEgo,bio,power)
        }
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.saveButton.setOnClickListener {
            val superheroName = binding.heronameedit.text.toString()
            val alterEgo = binding.alteregoedit.text.toString()
            val bio = binding.bioText.text.toString()
            val power = binding.ratingbar.rating
            val hero = Superhero(superheroName,alterEgo,bio,power)
            openDetailActivity(hero)
        }
    }
    /*private fun openDetailActivity(superheroName:String, alterEgo:String, bio:String, power: Float){
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra(DetailActivity.SUPERHERO_NAME_KEY,superheroName)
        intent.putExtra(DetailActivity.ALTER_EGO_KEY,alterEgo)
        intent.putExtra(DetailActivity.BIO_KEY,bio)
        intent.putExtra(DetailActivity.POWER_KEY,power)
        startActivity(intent)
    }*/
    private fun openDetailActivity(superhero: Superhero){
        val intent= Intent(this,DetailActivity::class.java)
        intent.putExtra(DetailActivity.SUPERHERO_KEY,superhero)
        startActivity(intent)
    }
}