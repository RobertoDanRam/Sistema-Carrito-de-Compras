import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productosDisponibles = new ArrayList<>();
        CarritoDeCompras carrito = new CarritoDeCompras();

        // Productos de ejemplo
        productosDisponibles.add(new Producto("Laptop", 15000));
        productosDisponibles.add(new Producto("Mouse", 250));
        productosDisponibles.add(new Producto("Teclado", 755));
        productosDisponibles.add(new Producto("Monitor", 3000));

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Mostrar productos disponibles");
            System.out.println("2. Agregar producto al carrito");
            System.out.println("3. Remover producto del carrito");
            System.out.println("4. Listar productos del carrito (con 10% de descuento)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: "); // Se agrega una exception
try {
    opcion = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Error: debe ingresar un número, no letras.");
    opcion = -1; // valor inválido para repetir el ciclo sin salir
}

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Productos disponibles ---");
                    productosDisponibles.forEach(Producto::mostrarInformacion);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del producto a agregar: ");
                    String nombreAgregar = scanner.nextLine();
                    productosDisponibles.stream()
                            .filter(p -> p.getNombre().equalsIgnoreCase(nombreAgregar))
                            .findFirst()
                            .ifPresentOrElse(
                                    carrito::agregarProducto,
                                    () -> System.out.println("Producto no encontrado.")
                            );
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    carrito.eliminarProducto(nombreEliminar);
                    System.out.println("Producto eliminado del carrito.");
                    break;

                case 4:
                    System.out.println("\n--- Productos en el carrito con descuento ---");
                    carrito.listarProductos();
                    double total = carrito.calcularPrecioTotalConDescuento(10);
                    System.out.printf("Total con descuento aplicado: $%.2f\n", total);
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
