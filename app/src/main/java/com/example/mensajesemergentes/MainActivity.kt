package com.example.mensajesemergentes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSaludar.setOnClickListener {
            if (!etNombre.text.isEmpty()) {
                /*
                //respuesta
                Toast.makeText(
                    applicationContext,
                    "Hola ${etNombre.text}",
                    Toast.LENGTH_LONG
                ).show()
                */

                Snackbar.make(
                    root_layout,
                    "Hola ${etNombre.text}",
                    Snackbar.LENGTH_LONG
                ).setAction("Hecho") {
                    root_layout.setBackgroundColor(Color.BLUE)
                }.show()
            }
        }
    }
}