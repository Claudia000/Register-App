package com.example.playaudioevening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.playaudioevening.Adapter.MusicAdapter
import com.example.playaudioevening.Model.Music

class MainActivity : AppCompatActivity() {
    private lateinit var list_view : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_view = findViewById(R.id.list_view)

        val arrayList : ArrayList<Music> = ArrayList()
        arrayList.add(Music("0", R.raw.teni))
        arrayList.add(Music("1", R.raw.teni))


        val customAdapter : MusicAdapter = MusicAdapter(arrayList)
        list_view.adapter = customAdapter


    }

}