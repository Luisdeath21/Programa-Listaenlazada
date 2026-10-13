public class Main {
    public static void main(String[] args) {
        ListaEnlazada misListas = new ListaEnlazada();

        System.out.println("¿La lista está vacía? " + misListas.estaVacia());

        misListas.insertarAlFinal(50);
        misListas.insertarAlFinal(75);
        misListas.insertarAlFinal(100);
        System.out.print("Después de agregar 50, 75, 100 al final: ");
        misListas.imprimir();

        misListas.insertarAlInicio(25);
        System.out.print("Después de agregar 25 al inicio: ");
        misListas.imprimir();

        System.out.println("¿Existe el 75? " + misListas.buscar(75));
        System.out.println("¿Existe el 99? " + misListas.buscar(99));

        System.out.println("Cantidad de elementos: " + misListas.contar());
        System.out.println("Elemento en posición 1: " + misListas.obtener(1));

        misListas.eliminar(75);
        System.out.print("Después de quitar el 75: ");
        misListas.imprimir();

        misListas.eliminar(25);
        System.out.print("Después de quitar el primero (25): ");
        misListas.imprimir();

        misListas.eliminar(100);
        System.out.print("Después de quitar el último (100): ");
        misListas.imprimir();

        misListas.eliminar(50);
        System.out.print("Después de eliminar todo: ");
        misListas.imprimir();
    }
}