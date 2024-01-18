package com.example.actividad3_233121

fun main() {
    println(validacion("nombre"))
    println(validacion("_nombre"))
    println(validacion("_12"))
    println(validacion(""))
    println(validacion("012"))
    println(validacion("no$"))
}

fun validacion(cadena: String): Boolean {

    if (cadena.isEmpty()) {
        return false
    }


    val primerCaracter = cadena[0]
    if (!primerCaracter.isLetter() && primerCaracter != '_') {
        return false
    }


    for (caracter in cadena.substring(1)) {
        if (!caracter.isLetterOrDigit() && caracter != '_') {
            return false
        }
    }


    return true
}

