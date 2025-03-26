package Test;

import EjercicioNro1.*;
import EjercicioNro2.*;
import ListaSimple.ListaSimple;

public class Test {

    public static void main(String[] args) {
        EjercicioNro1 e = new EjercicioNro1();
        EjercicioNro2 e2 = new EjercicioNro2();

        ListaSimple<Integer> dividir = new ListaSimple<>();
        ListaSimple<Integer> promedio = new ListaSimple<>();

        //Ejercicio Nro 1: Dividir lista a partir de un numero.
        
        dividir.addInicio(3);
        dividir.addInicio(5);
        dividir.addInicio(8);
        dividir.addInicio(5);
        dividir.addInicio(10);
        dividir.addInicio(2);
        dividir.addInicio(1);
        
        System.out.println("Lista original: ");
        dividir.imprimir();

        e.dividirLista(dividir, 5);
        
        System.out.println("Lista dividida a partir de 5: ");
        dividir.imprimir();
        
        //Ejercicio Nro 2: Determine el promedio y los numero mayores a dicho promedio.
        
        promedio.addInicio(18);
        promedio.addInicio(17);
        promedio.addInicio(14);
        promedio.addInicio(15);
        promedio.addInicio(07);
        promedio.addInicio(20);
        promedio.addInicio(19);
        promedio.addInicio(13);
        promedio.addInicio(06);
        
        System.out.println("Promedio: "); 
        e2.Promedio(promedio);
    }
}
