package repositories;

//specific DEVICE

import dto.UserDTO;

import java.util.HashMap;
import java.util.List;

public class NoSqlUserRepository implements CrudBackend<UserDTO> {

    HashMap<String, UserDTO> users = new HashMap<>();

    @Override
    public UserDTO create(UserDTO userEntity) {
        users.put(userEntity.getId(), userEntity);
        System.out.println(userEntity.toString()+ "Criado com sucesso em repositório noSql!");
        return users.get(userEntity.getId());
    }

    @Override
    public UserDTO read(String id) {
        System.out.println("Query concluida com sucesso em repositório noSql!");
        return users.get(id);
    }

    @Override
    public UserDTO update(String id, UserDTO userEntity) {
        System.out.println("Update feito com sucesso no usuário " + userEntity.getName() +"em repositorio noSql!");
        users.put(id, userEntity);
        return null;
    }

    @Override
    public Boolean delete(String id) {
        System.out.println("Deletado usuário de ID " + id + "em repositorio noSql!");
        users.remove(id);
        return false;
    }

    @Override
    public String findAll() {
        return users.toString();
    }
}
