public class EjemploOrdenes {
    public static void main(String[] args) {


        // ----- PRODUCTOS ------
        Producto leche = new Producto("Alpura","Alpura 1.5L",30);
        Producto jamon = new Producto("Virginia","Jamón1/2",35);
        Producto galletas = new Producto("Gamesa","Galletas de Fresa", 40);
        Producto panBlanco = new Producto("Bimbo","Pan blanco", 45);
        Producto refresco2L = new Producto("Embotelladora Aga", "Red Cola 2L", 30);
        Producto jabonTrastes = new Producto("Colgate","Axion", 25);
        Producto queso = new Producto("Lala","Queso panela", 28);
        Producto agua600ml = new Producto("Danone","Bonafont 66ml",16);
        Producto papelHigienico = new Producto("CMPC","Papel Higienico ",22);
        Producto nuggetsPollo = new Producto("Nutra-Nuggets","Nuggets Congelados", 63);
        Producto nutella = new Producto("Ferrero", "Nutella", 77);
        Producto shampoo = new Producto(",Genomma Lab","Tio Nacho", 33);

        // ----- CLIENTES -----

        Cliente cliente1 = new Cliente("Sebastián","González Escalera");
        Cliente cliente2 = new Cliente("Yazmin","Carbajal Salas");
        Cliente cliente3 = new Cliente("Marcos","Perez López");

        // ----- ORDENES ------

        OrdenCompra orden1 = new OrdenCompra("Compra de consumibles");
        //orden1.setFecha("dd-MM-yyyy");
        orden1.setCliente(cliente1);
        orden1.addProducto(leche);
        orden1.addProducto(jamon);
        orden1.addProducto(panBlanco);
        orden1.addProducto(queso);

        OrdenCompra orden2 = new OrdenCompra("Compra de dulces");
        //orden2.setFecha("dd-MM-yyyy");
        orden2.setCliente(cliente2);
        orden2.addProducto(galletas);
        orden2.addProducto(refresco2L);
        orden2.addProducto(nutella);
        orden2.addProducto(nuggetsPollo);

        OrdenCompra orden3 = new OrdenCompra("Compra de productos de limpieza");
        //orden3.setFecha("dd-MM-yyyy");
        orden3.setCliente(cliente3);
        orden3.addProducto(jabonTrastes);
        orden3.addProducto(papelHigienico);
        orden3.addProducto(shampoo);
        orden3.addProducto(agua600ml);

        //generando salidas
        System.out.println(orden1);
        orden1.listarOrden();
        System.out.println("\n  -------------------------- total $" + orden1.granTotal());

        System.out.println(orden2);
        orden2.listarOrden();
        System.out.println("\n  -------------------------- total $" + orden2.granTotal());

        System.out.println(orden3);
        orden3.listarOrden();
        System.out.println("\n -------------------------- total $" + orden3.granTotal());
    }
}
