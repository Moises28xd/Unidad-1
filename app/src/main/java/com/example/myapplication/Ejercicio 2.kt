package com.example.myapplication

import java.util.*

fun main(){
    var User = "Moises"
    var Pass = "2322"

    println("Ingrese su nomnre de usuario: ")
    var usuario = readLine()
    println("Ingrese su contraseña: ")
    var contra = readLine()

    if (usuario == User && contra == Pass){
        println("Inicio de sesion correcto")
    }else{
        println("Error, los datos no coinciden\nVerifica tu usuario y contaseña")
    }
}