package com.aeg7.registrodesuperheroes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aeg7.registrodesuperheroes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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
    }
    private fun openDetailActivity(superheroName:String, alterEgo:String, bio:String, power: Float){
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("superhero_name",superheroName)
        intent.putExtra("alter_ego",alterEgo)
        intent.putExtra("bio",bio)
        intent.putExtra("power",power)
        startActivity(intent)
    }
}