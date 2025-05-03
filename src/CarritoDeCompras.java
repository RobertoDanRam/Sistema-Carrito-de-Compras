import java.util.ArrayList;
import java.util.List;

// Clase para gestionar una lista de productos
public class CarritoDeCompras {
    private List<Producto> productos;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    // Aplicar descuento a todos los productos y mostrar el total
    public double calcularPrecioTotalConDescuento(double porcentaje) {
        productos.forEach(p -> p.aplicarDescuento(porcentaje)); // expresión lambda
        return productos.stream().mapToDouble(Producto::getPrecio).sum(); // método de referencia
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            productos.forEach(Producto::mostrarInformacion); // método de referencia
        }
    }
}
