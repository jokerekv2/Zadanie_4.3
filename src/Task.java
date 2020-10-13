public class Task {
    private String name;
    private String description;
    private Person person;
    private int priority;

    public Task(String name, String description, Person person, int priority) {
        this(name, description, priority);
        this.person = person;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean highPriority() {
        if (priority > 0)
            return true;
        else
            return false;
    }

    public boolean mediumPriority() {
        if (priority == 0)
            return true;
        else
            return false;
    }

    public boolean lowPriority() {
        if (priority < 0)
            return true;
        else
            return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
