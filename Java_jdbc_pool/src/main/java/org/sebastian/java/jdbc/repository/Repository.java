package org.sebastian.java.jdbc.repository;

import java.util.List;

public interface Repository<T> {

    List<T> listar();

    T porId(long id);

    void guardar(T t);

    void eliminar(long id);
}
