package com.example.myapplication

import java.util.*

fun main (){
    var scanner = Scanner(System.`in`)
    println("Ingresa la temperatura: ")
    var temp = scanner.nextInt()

    if (temp <= 15){
        println("Usa un Abrigo hace frío")
    }else{if (temp in 20..25){
        println("Te irá bien si usas una Chaqueta, el clima es templado")
    }else{
        println("Es mejor que lleves algo ligero, hace calor")
    }}
}