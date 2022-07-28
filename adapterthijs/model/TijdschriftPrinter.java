package designpatternsabfe.adapterthijs.model;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class TijdschriftPrinter implements GeavanceerdePrinter {
    @Override
    public void drukTijdschrift(String titel) {
        System.out.println("Het volgende tijdschrift wordt gedrukt: " + titel);
    }

    @Override
    public void drukBoek(String titel) {
    }
}
