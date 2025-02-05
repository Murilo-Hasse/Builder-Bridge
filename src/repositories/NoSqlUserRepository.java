package repositories;

//specific DEVICE

import dto.UserDTO;



import java.util.ArrayList;
import java.util.List;

public class NoSqlUserRepository implements CrudBackend<UserDTO> {



    @Override
    public UserDTO create(UserDTO entity) {
        System.out.println(entity.toString()+ "Criado com sucesso em repositório noSql!");
        return null;
    }

    @Override
    public UserDTO read(String id) {
        System.out.println("Query concluida com sucesso em repositório noSql!");
        return null;
    }

    @Override
    public UserDTO update(String id, UserDTO entity) {
        System.out.println("Update feito com sucesso no usuário " + entity.getName() +"em repositorio noSql!");
        return null;
    }

    @Override
    public Boolean delete(String id) {
        System.out.println("Deletado usuário de ID " + id + "em repositorio noSql!");
        return false;
    }

    @Override
    public List<UserDTO> findAll() {
        return List.of();
    }
}
