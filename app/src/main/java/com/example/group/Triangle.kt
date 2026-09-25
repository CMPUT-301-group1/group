package com.example.group

class Triangle(x: Int, y: Int, val base: Int, val height: Int) : Shape(x, y) {
    fun area(): Double = 0.5 * base * height
}