package com.example.myapplication

fun removerduplicados(array: IntArray): IntArray {
    return array.distinctBy { it }.toIntArray()
}

fun main() {
    val array: IntArray = intArrayOf(1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6)

    val distinct = removerduplicados(array)

    println(distinct.contentToString())
}