package com.example.guessingnumbergame

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var num = findViewById<EditText>(R.id.editId)
        var res = findViewById<TextView>(R.id.result)
        var guess_num:Int = 20
        val showButton = findViewById<Button>(R.id.button)
        showButton.setOnClickListener()
        {
            var text: Int = num.text.toString().toInt()
            if(text == 20) res.text = "You Win !!"
            else if(text > 20) res.text ="Try lower number"
            else
                res.text = "Try higher number !!"

        }
    }
}