
package models;

/**
 *
 * @author NTV
 */
public class User {
    private String username, pass, role;

    public User() {
    }

    public User(String username, String pass, String role) {
        this.username = username;
        this.pass = pass;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
}
