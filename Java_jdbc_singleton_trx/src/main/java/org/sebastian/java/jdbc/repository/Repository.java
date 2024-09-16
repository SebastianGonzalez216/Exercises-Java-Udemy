package org.sebastian.java.jdbc.repository;

import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    List<T> listar() throws SQLException;

    T porId(long id) throws SQLException;

    void guardar(T t) throws SQLException;

    void eliminar(long id) throws SQLException;
}
