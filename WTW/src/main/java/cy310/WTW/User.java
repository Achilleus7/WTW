package cy310.WTW;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String password;

    public User() {}

    public User(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}