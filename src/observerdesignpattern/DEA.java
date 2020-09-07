package observerdesignpattern;
import java.util.ArrayList;

public class DEA implements Observer {


    private Subject cook;
    private ArrayList<String> locations;
    private String notes = "";


    /*
    declaring the private variables above, and assigning
     */
    public DEA(Subject cook){
        this.cook = cook;
        this.locations = new ArrayList<String>();
        this.notes = " ";
        cook.registerObserver(this);

    }

    /*
    update will add a location to the ArrayList locations, along w/ adding a new line and description to the notes
     */
    public void update(String location, String description) {
        locations.add(location);
        this.notes +="\n" + description;

    }

    /*
    Return the locations in the locations ArrayList and prints the notes after the locations.
     */
    public String getLog() {
        String str = "Locations \n";
        for (String location:locations){
            str += location + "\n";

        }
        str += "\nNotes:" + notes ;
        return str;
    }
}
