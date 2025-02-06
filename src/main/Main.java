package main;
import dto.Director;
import dto.GoogleUserBuilder;
import dto.NormalUserBuilder;
import dto.UserDTO;
import repositories.CrudBackend;
import repositories.NoSqlUserRepository;
import repositories.SqlUserRepository;
import services.UserService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CrudBackend<UserDTO> sqlRepo = new SqlUserRepository();
        CrudBackend<UserDTO> noSqlRepo = new NoSqlUserRepository();

        // Criando o mapa de repositórios
        Map<String, CrudBackend<UserDTO>> backends = new HashMap<>();
        backends.put("sql", sqlRepo);
        backends.put("nosql", noSqlRepo);
        UserService userService = new UserService(backends);

        NormalUserBuilder normalUserBuilder = new NormalUserBuilder();
        director.constructNormalUser(normalUserBuilder, "123", "John Doe", "john@example.com", 1000, 500, "Usuário ativo");
        UserDTO normalUser = normalUserBuilder.getProduct();

        // Criando um usuário Google
        GoogleUserBuilder googleUserBuilder = new GoogleUserBuilder();
        director.constructGoogleUser(googleUserBuilder, "456", "googleuser@gmail.com", 2000, 1000);
        UserDTO googleUser = googleUserBuilder.getProduct();



        userService.create(googleUser);
        userService.create(normalUser);
        System.out.println(userService.findAll("sql"));
        System.out.println(userService.findAll("nosql"));

    }
}