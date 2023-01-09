package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Task task1 = new Task("Cleaning", "Flat Cleaning", -1);
        task1.showTaskDescription();

        Task task2 = new Task("Cooking", "Making dinner", 1, (new Person("Anna", "Burns")));
        task2.showTaskDescription();

        Task task3 = new Task("Vaccuming", "Basement/Atic Vaccuming", 0);
        task3.showTaskDescription();
    }
}
