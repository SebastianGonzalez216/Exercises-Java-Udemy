package org.sebastian.java.jdbc;

import org.sebastian.java.jdbc.models.Categoria;
import org.sebastian.java.jdbc.models.Producto;
import org.sebastian.java.jdbc.repository.ProductoRepositoryImpl;
import org.sebastian.java.jdbc.repository.Repository;
import org.sebastian.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploConexion {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getConnection()) {

            Repository<Producto> repositorio = new ProductoRepositoryImpl();

            System.out.println("============== LISTAR ===========");
            repositorio.listar().forEach(System.out::println);

            /*System.out.println("============== OBTENER POR ID ===========");
            System.out.println(repositorio.porId(2L));*/

            /*System.out.println("============== INSERTAR PRODUCTO ===========");
            Producto producto = new Producto();
            producto.setNombre("Teclado mécanico");
            producto.setPrecio(500);
            producto.setFechaRegistro(new Date());

            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);

            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach(System.out::println);*/

            /*System.out.println("============== ACTUALIZAR PRODUCTO ===========");
            Producto producto2 = new Producto();
            producto2.setId(4L);
            producto2.setNombre("Teclado Corsair");
            producto2.setPrecio(700);

            Categoria categoria2 = new Categoria();
            categoria2.setId(3L);
            producto2.setCategoria(categoria2);

            repositorio.guardar(producto2);
            System.out.println("Producto actualizado con éxito");
            repositorio.listar().forEach(System.out::println);*/

            /*System.out.println("============== ELIMINAR PRODUCTO ===========");
            repositorio.eliminar(7L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);*/

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
