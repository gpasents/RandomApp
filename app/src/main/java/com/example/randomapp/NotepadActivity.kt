package com.example.randomapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NotepadActivity : AppCompatActivity() {
    private val cardList = generateDummyList(0)
    private val adapter = NotepadAdapter(cardList)


    private val resultContract = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result ->

        if (result?.resultCode ==Activity.RESULT_OK && result.data?.getStringExtra("noteText").toString() != ""){
            Log.d("noteText",result.data?.getStringExtra("noteText").toString())
            val index = cardList.size + 1

            cardList.add(CardItem(result.data?.getStringExtra("noteText").toString()))
            adapter.notifyItemInserted(index)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notepad)

        val recycler = findViewById<RecyclerView>(R.id.recycler_view)

        recycler.adapter = adapter
        recycler.layoutManager = GridLayoutManager(this,2)
        recycler.setHasFixedSize(true)
    }

    fun addNote(view: View){
        val newNoteIntent = Intent(this, NewNoteActivity::class.java)
        resultContract.launch(newNoteIntent)

    }


    private fun generateDummyList(size: Int): ArrayList<CardItem> {
        val list = ArrayList<CardItem>()
        for (i in 0 until size) {
            val item = CardItem("Item $i")
            list += item
        }
        return list
    }
}