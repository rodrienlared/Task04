package com.rodri.ejercicio4aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.textoSaludo)
        //Recuperamos la información pasada en el intent
        val nombre = intent.getStringExtra("NOMBRE")
        val apellidos = intent.getStringExtra("APELLIDOS")
        val telefono = intent.getStringExtra("TELEFONO")
        val comentarios = intent.getStringExtra("COMENTARIOS")
        //Construimos el mensaje a mostrar
        txtSaludo.text = "\n\n¡Hola $nombre! Bonitos apellidos, ¿huh?: \"$apellidos\".\n\nTu número de teléfono es $telefono, y los comentarios que nos has enviado son los siguientes: \n\n$comentarios"
    }
}
