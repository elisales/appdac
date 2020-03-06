package com.example.appdac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao_Login.setOnClickListener{
            proximatela()
        }


    }

    private fun proximatela(){
        val intent = Intent(this, menualuno000::class.java)
        startActivity(intent)
    }

}
