package observerdesignpattern;

public interface Observer {
    public void update(String location, String description);
    public String getLog();
}
