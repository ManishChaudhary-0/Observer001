package observerdesignpattern;
import java.util.ArrayList;

public class Cartel implements Observer{

    private Subject cook;
    private ArrayList<Sighting> sightings;

    /*
    Constructor for Observer class, declared the private variables above, and assigns cook.
     */
    public Cartel(Subject cook){
        cook.registerObserver(this);
        this.cook = cook;
        this.sightings = new ArrayList<>();

    }

    /*
    Update will add/create a new sighting, including the location and description, to the ArrayList sightings.
     */
    public void update(String location, String description) {
        sightings.add(new Sighting(location,description));
    }

    /*
    returns the Cartel log, which outputs the location and details, from the sightings ArrayList in the same line.
     */
    public String getLog() {
        String logLocation = "";
        for (Sighting sighting:sightings){
            logLocation += sighting.getLocation() + " (" + sighting.getDetails() + ")\n";
        }
        return logLocation;
    }

}
