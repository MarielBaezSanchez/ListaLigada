
public class ListaLigada {

    private class Nodo {

        private int valor;
        private Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
            this.siguiente = null;
        }

        public int getValor() {
            return this.valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public Nodo getSiguiente() {
            return this.siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }

    private Nodo head;
    private Nodo tail;
    private int length;  // Added the variable `length`

    public ListaLigada() {
        this.head = null;
        this.tail = null;
        this.length = 0;  // Initialize `length` to 0
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void addLast(int valor) {
        Nodo nodo = new Nodo(valor);
        if (isEmpty()) {
            this.head = nodo;
            this.tail = nodo;
            this.length++;
        } else {
            this.tail.setSiguiente(nodo);
            this.tail = nodo;
            this.length++;
        }
    }

    public void addInit(int valor) {
        Nodo nodo = new Nodo(valor);
        if (isEmpty()) {
            this.head = nodo;
            this.tail = nodo;
            this.length++;
        } else {
            nodo.setSiguiente(this.head);
            this.head = nodo;
            this.length++;
        }
    }

    public void agregarH(int valor, int posicion){
        Nodo NodoHead=new Nodo(valor);
        Nodo auxiliar = head;
        for (int i = 1; i < posicion - 1; i++) {
            auxiliar = auxiliar.getSiguiente();
        }
        NodoHead.setSiguiente(auxiliar.getSiguiente());
        auxiliar.setSiguiente(NodoHead);

        if (posicion == length + 1) {
            tail = NodoHead;
        }
        length++;
    }

    public void deleteInit() {
        Nodo auxiliar = this.head;
        this.head = auxiliar.getSiguiente();
        if (this.head == null) {
            this.tail = null;
        }
        this.length--;
    }

    public void deletePosition(int valor) {
        if (isEmpty()) {
            System.out.println("No se puede eliminar la lista, aun está vacía");
            return;
        }

        Nodo actual = this.head;
        Nodo anterior = null;

        while (actual != null && actual.getValor() != valor) {
            anterior = actual;
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            System.out.println("El elemento " + valor + " no está en la lista");
            return;
        }

        if (anterior == null) {
            this.head = actual.getSiguiente();
            if (this.head == null) {
                this.tail = null;
            }
        } else {
            anterior.setSiguiente(actual.getSiguiente());
            if (anterior.getSiguiente() == null) {
                this.tail = anterior;
            }
        }

        this.length--;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("La lista esta vacía");
        } else {
            Nodo auxiliar = this.head;
            while (auxiliar != null) {
                System.out.println(auxiliar.getValor());
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }

    public int getLength() {
        return this.length;  // Added the `getLength()` method
    }
}
