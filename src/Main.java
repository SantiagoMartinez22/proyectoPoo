import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Empresa empresa = new Empresa("CiclasYScooters", "Colombia", "2023", "calle 56 #24", 0.0, "2/6");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenú de Opciones:");
                System.out.println("1. Mostrar Vehículos Disponibles");
                System.out.println("2. Alquilar Vehículo");
                System.out.println("3. Calcular Ingresos");
                System.out.println("4. Añadir Cliente");
                System.out.println("5. Para añadir una bicicleta");
                System.out.println("6. Para añadir una Scooter");

                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        empresa.mostrarVehiculosDisponibles();
                        break;
                    case 2:
                        empresa.alquilarVehiculo();
                        break;
                    case 3:
                        empresa.calcularIngresos();
                        break;
                    case 4:
                        empresa.añadirCliente();
                        break;
                    case 5:
                        empresa.agregarBicicleta();
                        break;
                    case 6:
                        empresa.agregarScooter();
                        break;


                    case 7:
                        System.out.println("Gracias por utilizar nuestro sistema.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        }


    }




