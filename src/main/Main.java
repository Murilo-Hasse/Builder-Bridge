package main;
import dto.Director;
import dto.GoogleUserBuilder;
import dto.NormalUserBuilder;
import dto.UserDTO;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        NormalUserBuilder normalUserBuilder = new NormalUserBuilder();
        director.constructNormalUser(normalUserBuilder, "123", "John Doe", "john@example.com", 1000, 500, "Usuário ativo");
        UserDTO normalUser = normalUserBuilder.getProduct();
        System.out.println("Usuário Normal: " + normalUser.getName() + ", Google Account? " + normalUser.getGoogleAccount());

        // Criando um usuário Google
        GoogleUserBuilder googleUserBuilder = new GoogleUserBuilder();
        director.constructGoogleUser(googleUserBuilder, "456", "googleuser@gmail.com", 2000, 1000);
        UserDTO googleUser = googleUserBuilder.getProduct();
        System.out.println("Usuário Google: " + googleUser.getEmail() + ", Google Account? " + googleUser.getGoogleAccount());
    }
}