package com.example.fundamentosbasicos

class Cedula (val numero:String ){

     fun isValid(): String {
         var calculo = 0
         var lista = arrayListOf<Int>()
         var flag = true

         for (x in numero.toCharArray()) {
             // Segun la posicion del numero de cada digito
             // se multiplicara por 2 o caso contrario se ubica el mismo numero
             if (flag) {
                 calculo = x.digitToInt() * 2
                 flag = false
             } else {
                 calculo = x.digitToInt()
                 flag = true
             }

             // Si el calculo excede una cifra entonces se
             // sumaran sus cifras, caso contrario se añadria directamente
             if (calculo < 10) {
                 lista.add(calculo)
             } else {
                 var comp =
                     (calculo.toString()[0]).digitToInt() + (calculo.toString()[1]).digitToInt()
                 lista.add(comp)

             }
         }

         // Se guarda y se elimina el ultimo digito para comparar posteriormente
         var ultimoLista = lista.last()
         lista.remove(lista.last())

         // Se suma los valores de la lista y se busca el inmediato superior
         var sumaLista = lista.sum()
         var superior = sumaLista - (sumaLista % 10) + 10;

         // Si el ultimo digito es igual a la resta del superior con el total de la lista
         // es una cedula valida
         if (superior- sumaLista == ultimoLista) {
             return "Cedula válida"
         } else {
             return "Cedula inválida"
         }
     }
}