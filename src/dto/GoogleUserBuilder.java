package dto;
public class GoogleUserBuilder implements UserBuilder {
    private UserDTO user;

    public GoogleUserBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.user = new UserDTO();
    }

    @Override
    public UserBuilder setId(String id) {
        user.setId(id);
        return this;
    }

    @Override
    public UserBuilder setName(String name) {
        // Google users might get their name automatically
        return this;
    }

    @Override
    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    @Override
    public UserBuilder setPointsRank(Integer pointsRank) {
        user.setPointsRank(pointsRank);
        return this;
    }

    @Override
    public UserBuilder setPointsCasual(Integer pointsCasual) {
        user.setPointsCasual(pointsCasual);
        return this;
    }

    @Override
    public UserBuilder setDescription(String description) {
        return this; // Descrição não pode ser definida manualmente
    }

    @Override
    public UserBuilder setGoogleAccount(Boolean isGoogleAccount) {
        user.setGoogleAccount(true); // Sempre verdadeiro para Google Users
        return this;
    }

    @Override
    public UserDTO getProduct() {
        UserDTO result = this.user;
        this.reset();
        return result;
    }
}