package D_Methods.D_Methods;

import java.util.Date;

public class User {

    // --- Attributes ---
    private int userId;
    private String username;
    private String password;
    private String email;
    private Date dateCreated;
    private String status;

    // --- Constructor ---
    public User(int userId, String username, String password, String email, Date dateCreated, String status) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    // --- Getters and Setters ---
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // --- Methods ---
    public boolean login(String username, String password) {
        // Example logic (in real-world apps, password hashing and database check would be used)
        return this.username.equals(username) && this.password.equals(password);
    }

    public void logout() {
        System.out.println(username + " has logged out.");
    }

    public void updateProfile(String newEmail, String newPassword) {
        if (newEmail != null && !newEmail.isEmpty()) {
            this.email = newEmail;
        }
        if (newPassword != null && !newPassword.isEmpty()) {
            this.password = newPassword;
        }
        System.out.println("Profile updated for user: " + username);
    }

    public void deactivate() {
        this.status = "inactive";
        System.out.println("User " + username + " has been deactivated.");
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", dateCreated=" + dateCreated +
                ", status='" + status + '\'' +
                '}';
    }
}