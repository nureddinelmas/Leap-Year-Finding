package com.nureddinelmas.deneme2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun hesapla(view : View){

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        var year = 0

        if (editText != null){
            var y : String = editText.getText().toString()
            year = Integer.parseInt(y)
        }


        if (year % 4 == 0 ){
            textView.text = "det är ett skottår"
        }
        else{
            textView.text = "det  INTE är ett skottår"
        }
    }

}