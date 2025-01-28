package QSpider.object;

import java.util.Objects;

public class User {

    int id;
    String username;
    String password;
    String bio;

    User(User user){
        this.id = user.id;
        this.username = user.username;
        this.password = user.password;
        this.bio = user.bio;
    }

    User(int id, String username, String password, String bio){
        this(id, username, password);
        this.bio = bio;
    }

    User(int id, String username, String password){
        if(id<4)
            this.id = id;
        this.username = username;
        this.password = password;
    }

    public boolean isValidUser(String password){
        return Objects.equals(this.password, password);
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
