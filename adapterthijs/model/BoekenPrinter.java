package designpatternsabfe.adapterthijs.model;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class BoekenPrinter implements GeavanceerdePrinter {
    @Override
    public void drukTijdschrift(String titel) {
    }

    @Override
    public void drukBoek(String titel) {
        System.out.println("Het volgende boek wordt gedrukt: " + titel);
    }
}
