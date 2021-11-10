package com.example.fundamentosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eresMayorEdad(18)
        tablaMultiplicar(5)
        listados()
        vehiculos()
        cedula("1104539273")
    }

    // Verficacion de edad
    fun eresMayorEdad(edad:Int) {
        if (edad >= 18){
            println("Eres mayor de edad")
        } else {
            println("Eres menor de edad")
        }
        println("__________________")
    }

    // Tabla de multiplicar cuadrada de un numero n
    fun tablaMultiplicar(n:Int){
        var r = arrayListOf<Int>()
        for (x in 0..n){
            r.add( n *x)
        }
        println("Ordenados:\n ${r.sorted()}")
        println("Ordenados inversamente:\n ${r.reversed()}")
        println("__________________")
    }

    // Lista de personas dentro del paralelo y sub grupos
    fun listados(){
        var paralelo = listOf(1 to "David Pillco",2 to "Edgar Guamo" ,3 to "Joan Briceño",1 to "Luis Quizhpe",
            2 to "Erick Jaramillo", 3 to "David Salazar", 1 to "Ian Ortega")
        println("Listado total \n $paralelo")
        //println("Listado de grupos\n  ${paralelo.groupBy{it.first}}")
        println("Por grupos")
        paralelo.groupBy{it.first}.forEach{grupo ->
            println( grupo )
        }
        println("__________________")
    }

    // Creacion de objetos vehiculo
    fun vehiculos(){
        val runner = Vehicle("FWD", "2300cc", 4, Vehicle.Tipo.AUTOMOVIL)
        val ford150 = Vehicle("4x4", "2500cc", 4, Vehicle.Tipo.CAMIONETA)
        println(ford150.motor)
        println(runner.tipo)
        println("__________________")

    }

    // Cedula validacion
    fun cedula (cedula:String){
        val persona= Cedula(cedula)
        println(persona.isValid())
        println("__________________")
    }
}