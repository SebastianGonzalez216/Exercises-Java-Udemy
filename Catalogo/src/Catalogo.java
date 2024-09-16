import com.sebas.productos.*;
import com.sebas.libros.*;
import com.sebas.electronicos.*;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;


public class Catalogo {
    public static void main(String[] args) {

        Date fecha = new Date();

        IProducto[] productos = new Producto[5];

        productos[0] = new TvLcd(26000, "Sony", 40);
        productos[1] = new IPhone(24000, "Apple", "Verde" ,"15 pro max");
        productos[2] = new Libro(800, fecha , "Albert Camus","El extranjero","Éditions Gallimard");
        productos[3] = new Comic(500,fecha, "Stan Lee","The Amazing Spider-Man", "Marvel Comics", "Spider-Man");
        productos[4] = new TvLcd(30000, "Samsung", 50);

        for(IProducto listaProductos : productos){
            System.out.println(listaProductos);
        }
    }
}
