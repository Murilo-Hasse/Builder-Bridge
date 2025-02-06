package repositories;

//DEVICE


public interface CrudBackend<T> {
    T create(T entity);

    T read(String id);

    T update(String id, T entity);

    Boolean delete(String id);

    String findAll();
}
