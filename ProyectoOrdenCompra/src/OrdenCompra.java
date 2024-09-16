import java.util.Date;

public class OrdenCompra {
    private static int idContador = 0;

    private int id;
    private String descripcion;
    private Date fecha = new Date();
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(){
        this.id = ++idContador;
    }

    public OrdenCompra(String descripcion){
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto (Producto producto){

        for(int i = 0; i < productos.length; i++){
            if(productos[i] == null){
                productos[i] = producto;
                break;
            }
        }
    }

    public void listarOrden(){
        for(int i = 0; i < productos.length; i++){
            System.out.println((i+1) + ".- " + productos[i].getFabricante() + " | " + productos[i].getNombre() + " ------ $"+ productos[i].getPrecio());
        }
    }

    public int granTotal (){
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

    @Override
    public String toString() {
        return
                "\nID de la compra: " + id +
                ", descripcion: --- " + descripcion + " ---" +
                "| fecha: " + fecha +
                ", cliente: " + cliente.getNombre() + " " + cliente.getApellidos() + " ---\n";
    }
}

