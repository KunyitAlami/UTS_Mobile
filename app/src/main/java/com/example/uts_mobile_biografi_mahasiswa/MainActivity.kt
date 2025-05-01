package com.example.uts_mobile_biografi_mahasiswa

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val fotoawal = findViewById<ImageView>(R.id.foto_profil)
        val button_pindah = findViewById<Button>(R.id.button_detail_lengkap)
        val namalengkap= findViewById<TextView>(R.id.nama)
        val nim = findViewById<TextView>(R.id.NIM)
        val jurusan = findViewById<TextView>(R.id.jurusan)
        val semester = findViewById<TextView>(R.id.semester)
        val akuninstagram = findViewById<TextView>(R.id.akuninstagram)
        val akungithub = findViewById<TextView>(R.id.akungithub)
        val akunlinkedin = findViewById<TextView>(R.id.akunlinkedin)

        button_pindah.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }

}