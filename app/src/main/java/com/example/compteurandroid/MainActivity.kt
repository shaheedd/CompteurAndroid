package com.example.compteurandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variable du compteur
    var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupération des composants graphiques
        val textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)
        val buttonIncrementer = findViewById<Button>(R.id.buttonIncrementer)
        val buttonDecrementer = findViewById<Button>(R.id.buttonDecrementer)
        val buttonReinitialiser = findViewById<Button>(R.id.buttonReinitialiser)
        val buttonToast = findViewById<Button>(R.id.buttonToast)

        // Bouton +
        buttonIncrementer.setOnClickListener {
            compteur++
            textViewCompteur.text = compteur.toString()
        }

        // Bouton -
        buttonDecrementer.setOnClickListener {
            compteur--
            textViewCompteur.text = compteur.toString()
        }

        // Bouton Réinitialiser
        buttonReinitialiser.setOnClickListener {
            compteur = 0
            textViewCompteur.text = compteur.toString()
        }

        buttonToast.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_SHORT).show()
        }
    }
}