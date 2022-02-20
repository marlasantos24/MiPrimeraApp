package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val elNombre = findViewById<EditText>(R.id.etNombre)
        val checkbox = findViewById<CheckBox>(R.id.cbDeveloper)

        bSaludar.setOnClickListener(View.OnClickListener {

            if(validarDato()){
                if(checkbox.isChecked){
                    Toast .makeText(this, "Hola!, Bienvenid@ "+ elNombre.text + ", sé que eres un desarrollador.", Toast.LENGTH_LONG).show()

                }else{
                    Toast .makeText(this, "Hola!, Bienvenid@ "+ elNombre.text, Toast.LENGTH_LONG).show()
                }

            }else{
                Toast.makeText(this, "Escribe tu nombre para saludarte", Toast.LENGTH_LONG).show()
            }

        })
    }

    fun validarDato():Boolean{
        val elNombre = findViewById<EditText>(R.id.etNombre)
        val nombreUsuario  = elNombre.text
        if(nombreUsuario.isNullOrEmpty()){
            return false
        }
        return true
    }
}