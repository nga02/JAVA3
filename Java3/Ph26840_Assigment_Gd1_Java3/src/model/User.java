package model;

public class User {

    private String user;
    private String pass;
    private boolean role;

    public User() {
    }

    public User(String user, String pass, boolean role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "user=" + user + ", pass=" + pass + ", role=" + role + '}';
    }

}
