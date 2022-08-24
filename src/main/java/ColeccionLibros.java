import java.util.Arrays;

public class ColeccionLibros {
    public static void main(String[] args) {
        String[][] misLibros = new String[100][3];
        menu();

    }

    private static void menu() {
        System.out.println("MENU");
        System.out.println("Seleccione ingrese el numero de la opcion que deseas:");
        System.out.println("1. AGREAR LIBRO");
        System.out.println("2. MOSTRAR ESPACIOS USADOS");
        System.out.println("3. MOSTRAR ESPACIOS DISPONIBLES");
        System.out.println("4. MOSTRAR TODA LA COLECCION");

    }

    public static String[][] agregarLibro(String misLibros[][], String titulo, String autor, String editorial) {

        for (int i = 0; i < misLibros.length; i++) {
            for (int j = 0; j < misLibros[i].length; j++) {
            }

        }
        return misLibros ;
    }





    public static void mostrarBusquedaLibroAutor(String[][] misLibros, String titulo, String autor, String editorial){

    }

    private static void mostrarTodaColeccion(String[][] misLibros) {
        for (int i = 0; i < misLibros.length; i++) {
            System.out.println(Arrays.toString(misLibros[i]));
        }
    }
}
