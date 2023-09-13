public class Producto {




    private String descripcion;
    private int stock;
    private double precio;
private int id;
    public Producto(String descripcion, int stock, double precio,int id) {
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.id=id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                ", id=" + id +
                '}';
    }
}
