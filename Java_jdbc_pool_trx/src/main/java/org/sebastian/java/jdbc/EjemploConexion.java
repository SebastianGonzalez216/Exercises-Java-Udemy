package org.sebastian.java.jdbc;

import org.sebastian.java.jdbc.models.Categoria;
import org.sebastian.java.jdbc.models.Producto;
import org.sebastian.java.jdbc.repository.CategoriaRepositoryImpl;
import org.sebastian.java.jdbc.repository.ProductoRepositoryImpl;
import org.sebastian.java.jdbc.repository.Repository;
import org.sebastian.java.jdbc.services.CatalogoService;
import org.sebastian.java.jdbc.services.Service;
import org.sebastian.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploConexion {
    public static void main(String[] args) throws SQLException {

        Service servicio = new CatalogoService();
        System.out.println("============= listar =============");
        servicio.listar().forEach(System.out::println);

        System.out.println("============= Insertar nueva categoria =============");
                Categoria categoria = new Categoria();
                categoria.setNombre("Iluminacion");

                System.out.println("============= insertar nuevo producto =============");
                Producto producto = new Producto();
                producto.setNombre("Lampara led escritorio");
                producto.setPrecio(990);
                producto.setFechaRegistro(new Date());
                producto.setSku("aura123");

                servicio.guardarProductoConCategoria(producto, categoria);
                System.out.println("Producto guardado con éxito: " + producto.getId());
                servicio.listar().forEach(System.out::println);

    }
}
