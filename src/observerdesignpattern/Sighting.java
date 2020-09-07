package observerdesignpattern;

public class Sighting {
    private String location;
    private String details;

    /*
    Sighting Constructor declaring and assigning the private variables above
     */
    public Sighting(String location, String details) {
        this.location = location;
        this.details = details;
    }

    /*
    returns Location
     */
    public String getLocation(){
        return location;
    }

    /*
    returns Details
     */
    public String getDetails(){
        return details;
    }
}
