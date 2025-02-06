package dto;

public class UserDTO {
    private String id;
    private String name;
    private String email;
    private Integer pointsRank;
    private Integer pointsCasual;
    private String description;
    private Boolean isGoogleAccount;

    // Construtor vazio para ser preenchido pelos builders
    public UserDTO() {}

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getPointsRank() { return pointsRank; }
    public void setPointsRank(Integer pointsRank) { this.pointsRank = pointsRank; }

    public Integer getPointsCasual() { return pointsCasual; }
    public void setPointsCasual(Integer pointsCasual) { this.pointsCasual = pointsCasual; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Boolean getGoogleAccount() { return isGoogleAccount; }
    public void setGoogleAccount(Boolean googleAccount) { isGoogleAccount = googleAccount; }

    @Override
    public String toString() {
        return "UserDTO{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pointsRank=" + pointsRank +
                ", pointsCasual=" + pointsCasual +
                ", isGoogleAccount=" + isGoogleAccount +
                '}';
    }
}