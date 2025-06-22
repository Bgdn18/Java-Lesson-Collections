package OOP.class_object.equals_hashcode_practice;

public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (o instanceof User anotherUser){
            return this.login.equals(anotherUser.login) && this.password.equals(anotherUser.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }
}
