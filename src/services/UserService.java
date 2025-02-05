package services;

import dto.UserDTO;
import repositories.CrudBackend;

import java.util.List;
import java.util.Map;

public class UserService extends CrudOperations <UserDTO>{

    public UserService(Map<String, CrudBackend<UserDTO>> backends) {
        super(backends);
    }

    private String rule(Boolean isGoogleAccount) {
        if (isGoogleAccount){
            return "nosql";
        }
        return "sql";
    }

    @Override
    public UserDTO create(UserDTO user) {
        return selectBackend(rule(user.getGoogleAccount())).create(user);
    }

    @Override
    public UserDTO read(String id, Boolean isGoogleAccount) {
        return selectBackend(rule(isGoogleAccount)).read(id);
    }

    @Override
    public UserDTO update(String id, UserDTO user) {
        return selectBackend(rule(user.getGoogleAccount())).update(id, user);
    }

    @Override
    public boolean delete(String id, Boolean isGoogleAccount) {
        return selectBackend(rule(isGoogleAccount)).delete(id);
    }

    @Override
    public List<UserDTO> findAll(String backendKey) {
        return selectBackend(backendKey).findAll();
    }
}

