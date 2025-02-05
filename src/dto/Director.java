package dto;

public class Director {
    public void constructNormalUser(UserBuilder builder, String id, String name, String email,
                                    Integer pointsRank, Integer pointsCasual, String description) {
        builder.reset();
        builder.setId(id)
                .setName(name)
                .setEmail(email)
                .setPointsRank(pointsRank)
                .setPointsCasual(pointsCasual)
                .setDescription(description)
                .setGoogleAccount(false);
    }

    public void constructGoogleUser(UserBuilder builder, String id, String email, Integer pointsRank, Integer pointsCasual) {
        builder.reset();
        builder.setId(id)
                .setEmail(email)
                .setPointsRank(pointsRank)
                .setPointsCasual(pointsCasual)
                .setGoogleAccount(true);
    }
}