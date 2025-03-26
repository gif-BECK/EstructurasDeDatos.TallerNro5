/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimple;

/**
 *
 * @author Jesús
 */

public class ListaSimple<E> {
    
    private Nodo <E> inicio;
    private Nodo <E> ultimo;

    public ListaSimple() {
    }

    public ListaSimple(Nodo<E> inicio, Nodo<E> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    /**
     * @return the inicio
     */
    public Nodo <E> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo <E> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public Nodo <E> getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo <E> ultimo) {
        this.ultimo = ultimo;
    }
    
    public void addInicio(E dato){
        Nodo <E> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (inicio == null){
            inicio = nuevo;
            ultimo = nuevo;
        }
        else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }    
    }
    
    public void imprimir(){
        Nodo <E> aux = inicio;
        while (aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    
    public void addFinal(E dato){
        Nodo <E> nuevo = new Nodo();
        nuevo.setDato(dato);
        if (inicio == null){
            inicio = nuevo;
            ultimo = nuevo;
        } 
        else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }
    
    public void ordenarAscendente() {
        boolean intercambio;
        do {
            intercambio = false;
            Nodo<E> aux = inicio;
            Nodo<E> anterior = null;

            while (aux.getSiguiente() != null) {
                if ((int)aux.getDato()>=(int)(aux.getSiguiente().getDato())) {
                    
                    E temp = aux.getDato();
                    aux.setDato(aux.getSiguiente().getDato());
                    aux.getSiguiente().setDato(temp);
                    intercambio = true;
                }
                anterior = aux;
                aux = aux.getSiguiente();
            }
        } while (intercambio);
    }
    
    public int buscar(E dato) {
        Nodo<E> aux = inicio;
        int posicion = 0;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return posicion;
            }
            aux = aux.getSiguiente();
            posicion++;
        }
        return -1;
    }
    
    public int contarMayores(E dato) {
        Nodo<E> aux = inicio;
        int cantidad = 0;
        
        while (aux != null) {
            
            if ((int)aux.getDato()>=(int)(dato)) {
                cantidad++;
            }
            aux = aux.getSiguiente();
        }
        return cantidad;
    }
    
    public void imprimirCedulas(){
        Nodo <E> aux = inicio;
        while (aux != null){
            System.out.println("Dato:" + aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    
}
