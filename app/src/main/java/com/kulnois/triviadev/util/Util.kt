package com.kulnois.triviadev.util

import com.kulnois.triviadev.data.model.Question

/**
 * Created by @kulnois on 23/08/2020.
 */

val questions: MutableList<Question> = mutableListOf(
    Question(text = "¿Qué es un algoritmo?",
        answers = listOf("Un conjunto de pasos para abordar la solución de un problema", "Codigo escrito en Ingles", "Reglas del idioma", "Solución Matematica")),
    Question(text = "¿Qué es un bucle?",
        answers = listOf("Una serie de instrucciones repetidas", " Repite varios conjuntos de instrucciones", "Una Validación", "Conjunto de datos estáticos")),
    Question(text = "¿Qué es modularización?",
        answers = listOf("Dividir problemas más pequeños en problemas más pequeños.", "Un conjunto de pasos para abordar la solución de un problema.", "Cuando tenga el gran problema y lo divida en subproblemas más pequeños, cada subproblema se puede resolver en unos pocos pasos.", "Ninguna de las anteriores")),
    Question(text = "¿Cuál es el idioma más básico que creó Microsoft?",
        answers = listOf("Visual Basic", "DirectX", "Batch", "C++")),
    Question(text = "¿Cuál de estos idiomas es el mas complicado de aprender?",
        answers = listOf("C++", "C", "C#.NET", "Actionscript")),
    Question(text = "No soy realmente un lenguaje de codificación, sino un lenguaje de consulta que se usa para acceder y manipular bases de datos?",
        answers = listOf("SQL", "JAVA", "HTML", "Python")),
    Question(text = "Soy un lenguaje multiplataforma orientado a objetos que quizás se adapte mejor a las aplicaciones web?",
        answers = listOf("Java", "PHP", "Perl", "Basic")),
    Question(text = "Son lenguajes de programación que se parecen más a los lenguajes humanos ordinarios?",
        answers = listOf("Lenguajes de programación de alto nivel", "Lenguajes de programación de bases de datos", "Lenguajes de programación de páginas web", "Lenguajes de programación RAD")),
    Question(text = "Convierte cada línea de su código fuente en lenguaje de máquina, una línea a la vez.",
        answers = listOf("Interprete", "Depurador", "Compilador", "Programa")),
    Question(text = "Una ubicación de memoria que contiene una sola letra o número?",
        answers = listOf("Char", "Double", "Word", "Int")))