package repositories;

//DEVICE

import java.util.List;

public interface CrudBackend<T> {
    T create(T entity);

    T read(String id);

    T update(String id, T entity);

    Boolean delete(String id);

    List<T> findAll();
}
