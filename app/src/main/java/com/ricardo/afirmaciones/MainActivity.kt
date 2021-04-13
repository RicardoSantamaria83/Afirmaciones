package com.ricardo.afirmaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ricardo.afirmaciones.adapter.ItemAdapter
import com.ricardo.afirmaciones.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val textView: TextView = findViewById(R.id.size_lista_afirmaciones)
        textView.text = DataSource().cargarAfirmaciones().size.toString()*/

        val misAfirmaciones = DataSource().cargarAfirmaciones()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, misAfirmaciones)
        recyclerView.setHasFixedSize(true)
    }
}