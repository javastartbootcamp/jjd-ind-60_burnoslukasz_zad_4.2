package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Cleaning", "Flat Cleaning", -1, (new Person("Lukas", "Burns")));
        System.out.println(task1.getTaskDescription());
        boolean highPrio = task1.highPriority();
        System.out.println("Is High priority? " + highPrio);
        task1.showTaskPriority();

        Task task2 = new Task("Cooking", "Making dinner", 10, (new Person("Anna", "Burns")));
        System.out.println(task2.getTaskDescription());
        boolean mediumPrio = task2.mediumPriority();
        System.out.println("Is Medium priority? " + mediumPrio);
        task2.showTaskPriority();

        Task task3 = new Task("Vaccuming", "Basement/Atic Vaccuming", 0);
        System.out.println(task3.getTaskDescWitoutPerson());
        boolean lowPrio = task3.lowPriority();
        System.out.println("Is Low priority? " + lowPrio);
        task3.showTaskPriority();

        Task task4 = new Task("Washing", "Bedlinen washing");
        System.out.println(task4.getTaskDescWitoutPersonAndPriority());
    }
}
