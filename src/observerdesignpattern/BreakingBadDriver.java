package observerdesignpattern;

public class BreakingBadDriver {


    public static void main(String[] args) {
        /*
        Assigns cook
         */
        Cook heinzenberg = new Cook("Heinzenberg");
        Observer dea = new DEA(heinzenberg);
        Observer cartel = new Cartel(heinzenberg);

        /*
        Assigns sightings with locations and descriptions.
         */
        System.out.println("***** " + heinzenberg.getName() + " is Breaking Bad *****");
        heinzenberg.enterSighting("School Chemistry Lab", "Meeting with Jesse");
        heinzenberg.enterSighting("RV in the desert", "Cooking");
        heinzenberg.enterSighting("Laundrymat", "Doing his Laundry...");
        heinzenberg.enterSighting("Car Wash", "Laundering Money");
        heinzenberg.enterSighting("Car Lot", "Buying a Fancy Sports Car");

        /*
        Calls log from DEA class
         */
        System.out.println("\n***** DEA Notes *****");
        System.out.println(dea.getLog());

        /*
        Calls log from Cartel Class
         */
        System.out.println("\n***** Cartel Notes *****");
        System.out.println(cartel.getLog());
    }
}