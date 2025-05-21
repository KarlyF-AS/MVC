import java.util.ArrayList;
import java.util.Scanner;

/**
 * Interfaz de usuario: menú y entradas/salidas
 */

public class View {
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1 -> crearCoche();
                case 2 -> cambiarVelocidad();
                case 3 -> acelerarCoche();
                case 4 -> bajarVelocidad();
                case 5 -> mostrarTodosLosCoches();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Crear coche");
        System.out.println("2. Cambiar velocidad");
        System.out.println("3. Aumentar Velocidad");
        System.out.println("4. Bajar velocidad");
        System.out.println("5. Mostrar todos los coches");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        return sc.nextInt();
    }

    private static void crearCoche() {
        System.out.print("Ingrese matrícula: ");
        String matricula = sc.next();
        System.out.print("Ingrese modelo: ");
        String modelo = sc.next();

        if (Model.crearCoche(modelo, matricula)) {
            System.out.println("Coche creado exitosamente.");
        } else {
            System.out.println("Error: La matrícula ya existe.");
        }
    }

    private static void cambiarVelocidad() {
        System.out.print("Ingrese matrícula: ");
        String matricula = sc.next();
        System.out.print("Ingrese nueva velocidad: ");
        int velocidad = sc.nextInt();

        Model.cambiarVelocidad(matricula, velocidad);
        System.out.println("✅ Velocidad actualizada.");
    }
    private static void acelerarCoche() {
        System.out.print("Ingrese matrícula: ");
        String matricula = sc.next();
        Model.acelerarCoche(matricula);
        System.out.println("Velocidad aumentada.");
    }

    private static void bajarVelocidad() {
        System.out.print("Ingrese matrícula: ");
        String matricula = sc.next();
        Model.bajarVelocidad(matricula);
        System.out.println("Velocidad disminuida.");
    }

    private static void mostrarTodosLosCoches() {
        System.out.println("\n--- LISTADO DE COCHES ---");
        ArrayList<Coche> lista = Model.getTodosLosCoches();

        if (lista.isEmpty()) {
            System.out.println("No hay coches registrados.");
        } else {
            for (Coche c : lista) {
                System.out.println(c.toString());
            }
        }
    }

    public static void mostrarVelocidad(String matricula, int velocidad) {
        if (velocidad == -1) {
            System.out.println("Coche no encontrado.");
        } else {
            System.out.println("Velocidad de " + matricula + ": " + velocidad + " km/h");
        }
    }
}