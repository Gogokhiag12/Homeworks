public class Subject {
    private String name;
    private String description;

    public Subject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public void changeDescription(String newDescription){
        this.description = newDescription;
    }
}
