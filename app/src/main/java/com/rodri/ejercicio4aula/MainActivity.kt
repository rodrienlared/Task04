package com.rodri.ejercicio4aula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtNombre : EditText
    private lateinit var txtApellidos: EditText
    private lateinit var txtTelefono : EditText
    private lateinit var txtComentarios : EditText
    private lateinit var btnAceptar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        txtApellidos = findViewById(R.id.txtApellidos)
        txtTelefono = findViewById(R.id.numeroTelefono)
        txtComentarios = findViewById(R.id.textComentanosAlgo)
        btnAceptar = findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@MainActivity, SaludoActivity::class.java)
            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", txtNombre.text.toString())
            intent.putExtra("APELLIDOS", txtApellidos.text.toString())
            intent.putExtra("TELEFONO", txtTelefono.text.toString())
            intent.putExtra("COMENTARIOS", txtComentarios.text.toString())
            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}
