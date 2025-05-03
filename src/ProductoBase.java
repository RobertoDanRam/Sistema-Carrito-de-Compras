// Clase abstracta para representar productos genericos (abstracción)
public abstract class ProductoBase {
    protected String nombre;
    protected double precio;

    public ProductoBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getters y setters (encapsulación)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método abstracto que puede ser sobrescrito
    public abstract void mostrarInformacion();
}
