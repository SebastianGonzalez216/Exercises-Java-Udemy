package org.sebastian.java.jdbc.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface Repository<T> {

    void setConn(Connection conn);

    List<T> listar() throws SQLException;

    T porId(long id) throws SQLException;

    T guardar(T t) throws SQLException;

    void eliminar(long id) throws SQLException;
}
