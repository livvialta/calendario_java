public class Event {
    private String title;
    private String description;

    public Event(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return title + ": " + description;
    }
}
