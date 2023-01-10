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

    String getPriority() {
        if (priority > 0) {
            return "Wysoki";
        } else if (priority == 0) {
            return "Normalny";
        } else {
            return "Niski";
        }

        void showTaskDescription() {
            if (person == null) {
                System.out.println("Kind of task: " + name + ". Task description: " + description
                        + ". Priority: " + getPriority());
            } else if (priority == 0) {
                System.out.println("Kind of task: " + name + ". Task description: " + description +
                        ". Person responsible: " + person.name + " " + person.surname);
            } else if (person == null && priority == 0) {
                System.out.println("Kind of task: " + name + ". Task description: " + description);
            } else {
                System.out.println("Kind of task: " + name + ". Task description: " + description
                        + ". Priority: " + getPriority() + ". Person responsible: " + person.name + " " + person.surname);
            }
        }
    }
}



