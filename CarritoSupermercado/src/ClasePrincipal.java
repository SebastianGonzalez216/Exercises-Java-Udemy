import com.carritosupermercado.productos.*;

public class ClasePrincipal {
    public static void main(String[] args) {


        Producto leche = new Lacteo(28, "Leche" ,40,1);
        Producto crema = new Lacteo(17, "Crema" ,10,1);
        Producto quesoPanela = new Lacteo(22, "Queso panela" ,15,1);
        Producto quesoAsadero = new Lacteo(24, "Queso asadero" ,15,1);
        Producto helado = new Lacteo(30, "Helado" ,10,1);;

        Producto manzana = new Fruta(8, "Manzana","Rojo", 0.125);
        Producto platano = new Fruta(10, "Plátano","Amarillo", 0.100);
        Producto melon = new Fruta(22, "Melon","Melon", 0.500);
        Producto naranja = new Fruta(12,"Naranja","Naranja",0.140);
        Producto mango = new Fruta(11, "Mango","Amarillo", 0.170);

        Producto jabonPolvo = new Limpieza(20,"Jabón en polvo","Blanqueador", 0);
        Producto jabonBaño = new Limpieza(19,"Jabón de baño","Aromatizante", 0);
        Producto desinfectante = new Limpieza(22,"Desinfectante","Antibacterial", 0.300);
        Producto detergente = new Limpieza(18,"Detergente","Arranca grasa", 0.200);
        Producto alcohol = new Limpieza(20,"Alcohol","Agua, Alcohol", 0.250);

        Producto lentejas = new NoPerecible(20, "Lentejas", 200, 400);
        Producto miel = new NoPerecible(18, "Miel", 600, 250);
        Producto lechePolvo = new NoPerecible(15, "Leche en polvo", 300, 500);
        Producto sopaFideo = new NoPerecible(19, "Miel", 250, 150);
        Producto arroz = new NoPerecible(18, "Arroz", 200, 450);

        BolsaSupermercado<Producto> bolsa1 = new BolsaSupermercado<>();
        bolsa1.addProducto(leche);
        bolsa1.addProducto(crema);
        bolsa1.addProducto(quesoPanela);
        bolsa1.addProducto(quesoAsadero);
        bolsa1.addProducto(helado);

        BolsaSupermercado<Producto> bolsa2 = new BolsaSupermercado<>();
        bolsa2.addProducto(manzana);
        bolsa2.addProducto(platano);
        bolsa2.addProducto(melon);
        bolsa2.addProducto(naranja);
        bolsa2.addProducto(mango);

        BolsaSupermercado<Producto> bolsa3 = new BolsaSupermercado<>();
        bolsa3.addProducto(jabonPolvo);
        bolsa3.addProducto(jabonBaño);
        bolsa3.addProducto(desinfectante);
        bolsa3.addProducto(detergente);
        bolsa3.addProducto(alcohol);

        BolsaSupermercado<Producto> bolsa4 = new BolsaSupermercado<>();
        bolsa4.addProducto(lentejas);
        bolsa4.addProducto(miel);
        bolsa4.addProducto(lechePolvo);
        bolsa4.addProducto(sopaFideo);
        bolsa4.addProducto(arroz);

        System.out.println("La bolsa 1 contiene:\n " + bolsa1.getProductos());
        System.out.println("La bolsa 2 contiene:\n " + bolsa2.getProductos());
        System.out.println("La bolsa 3 contiene:\n " + bolsa3.getProductos());
        System.out.println("La bolsa 4 contiene:\n " + bolsa4.getProductos());
    }
}
