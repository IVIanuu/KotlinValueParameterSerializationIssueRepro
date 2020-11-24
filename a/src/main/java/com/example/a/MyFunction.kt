package com.example.a

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class MyAnnotation

fun myFunction(@MyAnnotation myParameter: String) {

}
