import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        double totalCompra = 0;
        double saldo = 0;

        saldo = saldo();
        System.out.println("prueba" + saldo);
        descripcion();
        saldo -= valorCompra();
        do {
            mostrarMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("**   Escriba el número de la opción deseada   **");
            System.out.println("");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 0:
                    descripcion();
                    saldo -= valorCompra();
                    System.out.println("Saldo actual: " + saldo);
                    break;
                case 1:
                    System.out.println("Saldo en cuenta: " + saldo);
                    System.out.println("Saliendo del programa... Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }

        } while (opcion != 1);

    }
    public static double saldo(){
        Scanner scanner = new Scanner(System.in);
        double limite = 0;
        System.out.println("Ingrese limite de compra de tarjeta: ");
        limite = scanner.nextInt();
        System.out.println("Saldo:" + limite);
        return limite;
    }

    public static String descripcion() {
        Scanner scanner = new Scanner(System.in);
        String descripcion = " ";
        System.out.println("Ingrese descripción de la compra: ");
        descripcion = scanner.nextLine();
        System.out.println("Descripción de la compra: " + descripcion);
        return descripcion;
    }

    public static double valorCompra(){
        Scanner scanner = new Scanner(System.in);
        double montoDeCompra = 0;
        System.out.println("Escriba valor de la compra: ");
        montoDeCompra += scanner.nextInt();

        return montoDeCompra;
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija opción:");
        System.out.println("0 - Continuar");
        System.out.println("1 - Salir");
        System.out.println("");
    }
}