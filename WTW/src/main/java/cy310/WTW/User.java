package cy310.WTW;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;


public class User {

    @Id
    public String id;

    @Indexed(unique = true)
    private String username;
    private String password;
    private int zipCode;
    private int jacketThreshold;
    private int coatThreshold;



    public User() {}

    public User(String username)
    {
        this.username = username;
    }

    public User(String username, String password, int zipCode) {
        this.username = username;
        this.password = password;
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getJacketThreshold() {
        return jacketThreshold;
    }

    public void setJacketThreshold(int jacketThreshold) {
        this.jacketThreshold = jacketThreshold;
    }

    public int getCoatThreshold() {
        return coatThreshold;
    }

    public void setCoatThreshold(int coatThreshold) {
        this.coatThreshold = coatThreshold;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, username='%s', password='%s']",
                id, username, password);
    }

}