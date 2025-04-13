public class Manager extends User {
    public Manager(String name, String email) {
        super(name, email);
    }

    public void manageProject() {
        System.out.println(name + " is managing the project.");
    }
}
