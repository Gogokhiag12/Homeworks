public class Subject {
    private String name;
    private String description;

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
