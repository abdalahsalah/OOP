import java.util.ArrayList;

public class Project {
    private String projectName;
    private Manager projectManager;
    private ArrayList<Task> tasks;
    private ArrayList<TeamMember> team;

    public Project(String projectName, Manager manager) {
        this.projectName = projectName;
        this.projectManager = manager;
        this.tasks = new ArrayList<>();
        this.team = new ArrayList<>();
    }

    public void addTeamMember(TeamMember member) {
        team.add(member);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showProjectDetails() {
        System.out.println("Project: " + projectName);
        System.out.println("Manager: " + projectManager.getName());
        System.out.println("Team Members:");
        for (TeamMember member : team) {
            System.out.println("- " + member.getName());
        }
        System.out.println("Tasks:");
        for (Task task : tasks) {
            task.displayTask();
        }
    }
}
