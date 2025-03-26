package EjercicioNro1;

import ListaSimple.ListaSimple;
import ListaSimple.Nodo;

public class EjercicioNro1 {

    //Dividir lista a partir de un valor x
    public void dividirLista(ListaSimple<Integer> ListaSimple, int x) {
        Nodo<Integer> aux = ListaSimple.getInicio();
        ListaSimple<Integer> menores = new ListaSimple<>();
        ListaSimple<Integer> mayores = new ListaSimple<>();
        while (aux != null) {
            if (aux.getDato() < x) {
                menores.addInicio(aux.getDato());
            } else {
                mayores.addInicio(aux.getDato());
            }
            aux = aux.getSiguiente();
        }

        menores.getUltimo().setSiguiente(mayores.getInicio());
        ListaSimple.setInicio(menores.getInicio());
    }
}
