package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class Automaat {
    public Versnapering krijgVersnapering(String soort) {
        if (soort.equalsIgnoreCase("BLIKJE")){
            return new Blikje();
        } else if(soort.equalsIgnoreCase("FLESJE")){
            return new Flesje();
        } else if(soort.equalsIgnoreCase("DOOSJE")){
            return new Doosje();
        } else {
            return null;
        }
    }
}
