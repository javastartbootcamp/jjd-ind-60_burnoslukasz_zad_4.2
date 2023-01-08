package pl.javastart.task;

public class Task {
    String name;
    String description;
    int priority;
    Person person;

    public Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    String getTaskDescription() {
        return "Kind of task: " + name + ". Task description: " + description
                + ". Priority: " + priority + ". Person responsible: " + person.name + " " + person.surname;
    }

    String getTaskDescWitoutPerson() {
        return "Kind of task: " + name + ". Task description: " + description
                + ". Priority: " + priority;
    }

    String getTaskDescWitoutPersonAndPriority() {
        return "Kind of task: " + name + ". Task description: " + description + "\n";
    }

    public void showTaskPriority() {
        if (priority > 0)
            System.out.println("Kind of priority: High");
        else if (priority == 0)
            System.out.println("Kind of priority: Normal");
        else
            System.out.println("Kind of priority: Low");
        System.out.println("");
        {

        }
    }
}
