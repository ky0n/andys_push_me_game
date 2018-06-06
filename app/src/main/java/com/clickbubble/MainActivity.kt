package com.clickbubble

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_game.setOnClickListener( {
            Toast.makeText(this, "starting game ...", Toast.LENGTH_LONG ).show()
        })

        highscore.setOnClickListener( {
            Toast.makeText( this, "highscore XD", Toast.LENGTH_LONG ).show()
        })
    }
}
