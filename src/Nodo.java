public class Nodo {
    private int dato;
    private Nodo apuntador;

    public Nodo(int valor){
        // constructor de nodo
        this.dato= valor;
        this.apuntador= null;
    }

    public int getDato() {
        // dato contenido en el nodo
        return dato;
    }

    public void setDato(int dato) {
        // monidificar el dato contenido en el nodo
        this.dato = dato;
    }

    public Nodo getApuntador(){
        // regresa el nodo  al que esta apuntando o null
        return apuntador;
    }

    public void setApuntador(Nodo otroNodo) {
        // Apunta el apuntador a otroNodo
        this.apuntador = otroNodo;
    }



}