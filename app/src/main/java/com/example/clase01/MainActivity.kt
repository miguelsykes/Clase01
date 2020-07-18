package com.example.clase01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var nombre: String= "jose"
    var apellido = "sanchez"
    var anio = 2020

    val apellido2 = "jara"

    companion object{
        const val ITEM = "elemento1"
    }

    var url: String = ""
    lateinit var direccion: String

    var genero: String? = null
    var genero2 = ""

    fun metodo3(){
        genero= "masculino"
        genero2= genero!!

    }

    fun metodo4(){
        val lista=ArrayList<String>()
        lista.add("Elemento 1")
        lista.add("Elemento 2")
        lista.add("Elemento 3")

        for (item in lista){
            Log.d("for-clase02", "item: $item")
        }

        val array=Array(2){i ->

        }

        val elemento1 = Producto (1, "Miguel")
        elemento1.id= 2
        elemento1.nombre= "Miguel"
        elemento1.apellido= "Sanchez"   

    }

    fun metodo1() {
        nombre = "jose"
       // apellido2 = "jara"
         apellido= ITEM

        url = Variable.ENDPOINT

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("clase01-mitocode", "MainActivity onCreate")
        metodo4()
    }

    override fun onStart() {
        super.onStart()
        Log.d("clase01-mitocode", "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("clase01-mitocode", "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("clase01-mitocode", "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("clase01-mitocode", "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("clase01-mitocode", "MainActivity onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("clase01-mitocode", "MainActivity onRestart")

    }
}