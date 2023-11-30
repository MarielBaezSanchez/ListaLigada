import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        ListaLigada lista = new ListaLigada();

        while (true) {
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarAlFinal(lista);
                    break;
                case 2:
                    imprimirLista(lista);
                    break;
                case 3:
                    insertarAlInicio(lista);
                    break;
                case 4:
                    agregarH(lista);
                    break;
                case 5:
                    eliminarDelInicio(lista);
                    break;
                case 6:
                    eliminarEnPosicion(lista);
                    break;
                case 7:
                    mostrarTamanio(lista);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }

    private static int leerOpcion() throws IOException {
        System.out.println("1. Agregar dato al final");
        System.out.println("2. Imprimir la lista");
        System.out.println("3. Insertar dato al inicio");
        System.out.println("4. Insertar dato en una posición");
        System.out.println("5. Eliminar dato del inicio");
        System.out.println("6. Eliminar dato en una posición");
        System.out.println("7. Mostrar tamaño de la lista");
        System.out.println("8. Salir");

        System.out.println("Escribe una opción: ");
        int opcion = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return opcion;
    }

    private static void agregarAlFinal(ListaLigada lista) throws IOException {
        System.out.println("Escribe el valor a insertar: ");
        int valor = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        lista.addLast(valor);
    }

    private static void imprimirLista(ListaLigada lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacía");
        } else {
            lista.print();
        }
    }

    private static void insertarAlInicio(ListaLigada lista) throws IOException {
        System.out.println("Escribe el valor a insertar: ");
        int valor = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        lista.addInit(valor);
    }

    public static void agregarH(ListaLigada lista) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int valor;
        int posicion;
        System.out.println("Escribe el valor a agregrar");
        entrada=bufer.readLine();
        valor= Integer.parseInt(entrada);
        System.out.println("Escribe posicion donde se agregara");
        entrada=bufer.readLine();
        posicion= Integer.parseInt(entrada);
        lista.agregarH(valor, posicion);



    }

    private static void eliminarDelInicio(ListaLigada lista) {
        lista.deleteInit();
    }

    private static void eliminarEnPosicion(ListaLigada lista) throws IOException {
        System.out.println("Escribe el valor del dato que quieres eliminar: ");
        int valor = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        lista.deletePosition(valor);
    }

    private static void mostrarTamanio(ListaLigada lista) {
        System.out.println("El tamaño de la lista es: " + lista.getLength());
    }
}