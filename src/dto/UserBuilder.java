package dto;

public interface UserBuilder {
    void reset();
    UserBuilder setId(String id);
    UserBuilder setName(String name);
    UserBuilder setEmail(String email);
    UserBuilder setPointsRank(Integer pointsRank);
    UserBuilder setPointsCasual(Integer pointsCasual);
    UserBuilder setDescription(String description);
    UserBuilder setGoogleAccount(Boolean isGoogleAccount);
    UserDTO getProduct();
}
