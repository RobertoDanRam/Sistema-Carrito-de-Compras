// clase concreta que extiende ProductoBase e implementa descontable
public class Producto extends ProductoBase implements Descontable {

    public Producto(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precio -= precio * porcentaje / 100;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Producto: %s - Precio: $%.2f\n", nombre, precio);
    }
}
