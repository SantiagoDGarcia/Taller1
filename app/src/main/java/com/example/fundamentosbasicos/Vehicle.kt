package com.example.fundamentosbasicos

class Vehicle (val traccion:String, val motor:String, val capacidad:Int, val tipo:Tipo ){
    enum class Tipo{
        TRACTOR,
        CAMION,
        CAMIONETA,
        BUS,
        AUTOMOVIL,
        MOTO,
    }
}