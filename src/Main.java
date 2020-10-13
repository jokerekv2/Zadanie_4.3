public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("zakupy", "kupić mleko",
                new Person("Dominik", "Mikolajczyk"), 1 );
        Task task2 = new Task("gitara", "nastroić gitarę", 0 );
        Task task3 = new Task("obiad", "naleśniki");
        Task task4 = new Task("lololo", "tralala", -1 );


        System.out.println(task1.highPriority());
        System.out.println(task2.mediumPriority());
        System.out.println(task3.lowPriority());
        System.out.println(task4.lowPriority());
    }
}
