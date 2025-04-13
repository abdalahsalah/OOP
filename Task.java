public class Task {
    private String title;
    private String description;
    private TeamMember assignedMember;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void assignTo(TeamMember member) {
        this.assignedMember = member;
    }

    public void displayTask() {
        System.out.println("Task: " + title);
        System.out.println("Description: " + description);
        if (assignedMember != null) {
            System.out.println("Assigned to: " + assignedMember.getName());
        }
        System.out.println();
    }
}
