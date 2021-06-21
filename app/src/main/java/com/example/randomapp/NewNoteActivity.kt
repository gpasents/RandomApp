package com.example.randomapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_note)

    }
    fun saveNote(view: View){
        val notepadActivityIntent = Intent()
        val textView = findViewById<EditText>(R.id.newNote)
        notepadActivityIntent.putExtra("noteText",textView.text.toString())
        setResult(Activity.RESULT_OK,notepadActivityIntent)
        finish()
    }
}