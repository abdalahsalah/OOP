public class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("User: " + name + ", Email: " + email);
    }

    public String getName() {
        return name;
    }
}
