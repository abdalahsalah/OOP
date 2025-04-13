#  Java Project Management Tool

##  Overview
This is a simple **Java OOP** project that simulates a basic **project management tool**.  
It demonstrates the core concepts of Object-Oriented Programming like **inheritance**, **encapsulation**, and **object interaction** by modeling:

- A `Manager` who leads the project.
- `TeamMembers` who work on tasks.
- A `Project` that holds tasks and team members.
- `Tasks` assigned to team members.

This project was created for educational purposes in an **OOP course**.

---

##  Class Structure

### `User`
- Base class for `Manager` and `TeamMember`.
- Attributes: `name`, `email`.

### `Manager` *(extends User)*
- Represents the project manager.
- Can manage the project.

### `TeamMember` *(extends User)*
- Represents a team member who works on tasks.

### `Task`
- Has a `title`, `description`, and an optional assigned `TeamMember`.

### `Project`
- Contains:
  - `projectName`
  - `projectManager`
  - `ArrayList<TeamMember>` for team members
  - `ArrayList<Task>` for tasks
- Can:
  - Add team members
  - Add tasks
  - Show project details

---

##  How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/java-project-management-tool.git
