package com.example.listview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val frutenAm = arrayOf(
        "Apple",
        "Banana",
        "Orange",
        "Kiwi",
        "Strawberry",
        "Papay",
        "pineapple"
    )

    val frutepRi = arrayOf(
        "8",
        "12",
        "10",
        "13",
        "15",
        "5",
        "7"
    )

    val images = arrayOf(
        R.drawable.apple,
        R.drawable.banana,
        R.drawable.orange,
        R.drawable.kiwi,
        R.drawable.strawberry,
        R.drawable.papay,
        R.drawable.pineapple
    )
    
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listvIew)
        
        val myListAdapter = MyListAdapter(this, frutenAm, frutepRi, images)
        
        listView.adapter = myListAdapter
        
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicked At ${parent.getItemAtPosition(position)}", Toast.LENGTH_SHORT).show()
        }
    }
}