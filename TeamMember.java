public class TeamMember extends User {
    public TeamMember(String name, String email) {
        super(name, email);
    }

    public void workOnTask() {
        System.out.println(name + " is working on a task.");
    }
}
