package repositories;

//Specific DEVICE

import dto.UserDTO;

import java.util.HashMap;
import java.util.List;

public class SqlUserRepository implements CrudBackend<UserDTO> {

    HashMap<String, UserDTO> users = new HashMap<>();

    @Override
    public UserDTO create(UserDTO userEntity) {
        users.put(userEntity.getId(), userEntity);
        System.out.println(userEntity.toString()+ "Criado com sucesso em repositório Sql!");
        return null;
    }

    @Override
    public UserDTO read(String id) {
        System.out.println("Query concluida com sucesso em repositório Sql!");
        return null;
    }

    @Override
    public UserDTO update(String id, UserDTO userEntity) {
        System.out.println("Update feito com sucesso no usuário " + userEntity.getName() +"em repositorio Sql!");
        return null;
    }

    @Override
    public Boolean delete(String id) {
        System.out.println("Deletado usuário de ID " + id + "em repositorio Sql!");
        return false;
    }

    @Override
    public List<UserDTO> findAll() {
        return List.of();
    }
}
