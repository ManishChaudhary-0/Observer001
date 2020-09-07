package observerdesignpattern;
import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /*
    Cook Constructor
    */
    public Cook(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();
    }

    /*
    Registers the observer, observer is the cook
     */
    public void registerObserver(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    /*
    removes an observer from observers ArrayList
     */
    public void removeObserver(Observer observer){
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    public void enterSighting(String location, String description){
        notifyObservers(location,description);
    }

    /*
    updates Observers with location and descriptions
     */
    public void notifyObservers(String location, String description){
        for (Observer observer : observers){
            observer.update(location,description);
        }
    }

    /*
    returns name
     */
    public String getName(){
        return this.name;
    }


}
