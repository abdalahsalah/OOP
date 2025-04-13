public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Abdallah", "abdallah@example.com");
        TeamMember member1 = new TeamMember("Ali", "ali@example.com");
        TeamMember member2 = new TeamMember("Sara", "sara@example.com");

        Project project = new Project("OOP Project Tool", manager);
        project.addTeamMember(member1);
        project.addTeamMember(member2);

        Task task1 = new Task("Design Database", "Design the DB structure");
        Task task2 = new Task("Implement UI", "Create the frontend");

        task1.assignTo(member1);
        task2.assignTo(member2);

        project.addTask(task1);
        project.addTask(task2);

        project.showProjectDetails();
    }
}
