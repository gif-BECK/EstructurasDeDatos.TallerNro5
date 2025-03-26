/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioNro2;

import ListaSimple.ListaSimple;
import ListaSimple.Nodo;

public class EjercicioNro2 {

    public void Promedio(ListaSimple<Integer> ListaSimple) {
        int suma = 0;
        int cantidad = 0;
        Nodo<Integer> aux = ListaSimple.getInicio();

        while (aux != null) {
            suma += aux.getDato();
            aux = aux.getSiguiente();
            cantidad++;
        }
        System.out.println(suma/cantidad);
    }
}
