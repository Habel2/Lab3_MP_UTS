package com.example.lab3_mp_habel_073

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab3_mp_habel_073.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerContainer.layoutManager = layoutManager
        setList()
    }
    private fun setList() {
        val dataList: ArrayList<kategori> = ArrayList()
        dataList.add(kategori(R.drawable.rounded_orange, R.drawable.jumping_rope, "Exercises with Jumping Rope", "110 kcal", "10 min"))
        dataList.add(kategori(R.drawable.rounded_blue, R.drawable.holding_jumping_rope, "Exercises with Holding Jumping Rope ", "135 kcal", "8 min"))
        dataList.add(kategori(R.drawable.rounded_red, R.drawable.sitting_dumbells, "Exercises with Sitting Dumbbells", "135 kcal", "5 min"))


        val adapter = ListAdapter(dataList)
        binding.recyclerContainer.adapter = adapter
    }

}
