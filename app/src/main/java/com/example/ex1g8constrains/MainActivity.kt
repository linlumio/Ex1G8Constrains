package com.example.ex1g8constrains

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var stellaMerda:FloatingActionButton
    lateinit var campoTesto:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constrain_layout)

        stellaMerda = findViewById(R.id.stellaDemmmerda)
        campoTesto = findViewById(R.id.editTextTextPersonName)

        stellaMerda.setOnClickListener{
            //campoTesto.setText("Hai premuto la stella demmerda")

            Toast.makeText(this,"Questa è una stella demmerda",Toast.LENGTH_LONG).show()


        }



    }


}