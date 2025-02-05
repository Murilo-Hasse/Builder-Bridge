package dto;

public class NormalUserBuilder implements UserBuilder {
    private UserDTO user;

    public NormalUserBuilder() {
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
        user.setName(name);
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
        user.setDescription(description);
        return this;
    }

    @Override
    public UserBuilder setGoogleAccount(Boolean isGoogleAccount) {
        user.setGoogleAccount(false); // Sempre falso para usuários normais
        return this;
    }

    @Override
    public UserDTO getProduct() {
        UserDTO result = this.user;
        this.reset();
        return result;
    }
}
