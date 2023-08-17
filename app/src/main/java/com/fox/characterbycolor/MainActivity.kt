package com.fox.characterbycolor

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.fox.characterbycolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("ActivityMainBinding = null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDefine.setOnClickListener {
            showDescription(it)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    private fun showDescription(view: View) {
        val position = binding.spinnerColor.selectedItemPosition
        binding.tvCharacter.text = getDescriptionByPosition(position)
        Log.d("TAG", " $position")
        when (position) {
            0 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.red, null))
            1 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.orange, null))
            2 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.yellow, null))
            3 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.green, null))
            4 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.blue, null))
            5 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.DeepPink, null))
            6 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.violet, null))
            7 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.dark_blue, null))
            8 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.brown, null))
            9 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.gray, null))
            10 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.black, null))
            11 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.white, null))
            12 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.purple_own, null))
            13 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.turquoise, null))
            14 -> binding.viewColor.setBackgroundColor(
                resources.getColor(
                    R.color.light_green,
                    null
                )
            )
            15 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.vinous, null))
            16 -> binding.viewColor.setBackgroundColor(resources.getColor(R.color.biege, null))
            else -> {
                binding.viewColor.setBackgroundColor(resources.getColor(R.color.Aquamarine, null))
                Toast.makeText(this@MainActivity, "Sorry!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun getDescriptionByPosition(position: Int): String {
        val descriptions = resources.getStringArray(R.array.description_of_temp)
        return descriptions[position].toString()
    }
}