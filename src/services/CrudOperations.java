package services;

import repositories.CrudBackend;

import java.util.List;
import java.util.Map;



public abstract class CrudOperations<T> {

    protected Map<String, CrudBackend<T>> backends;

    public CrudOperations(Map<String, CrudBackend<T>> backends) {
        this.backends = backends;
    }

    // Método para selecionar dinamicamente o backend com base em uma chave
    protected CrudBackend<T> selectBackend(String key) {
        if (!backends.containsKey(key)) {
            throw new IllegalArgumentException("Backend com chave '" + key + "' não encontrado.");
        }
        return backends.get(key);
    }

    // Operações CRUD que agora requerem a escolha do backend
    public abstract T create( T entity);

    public abstract T read( String id, Boolean backEndRule);

    public abstract T update( String id, T entity);

    public abstract boolean delete( String id, Boolean backEndRule);

    public abstract String findAll(String backendKey);
}
