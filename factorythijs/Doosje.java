package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class Doosje implements Versnapering {
    public Afvalbeleid consumeren() {
        Afvalbeleid afvalbeleid = new Afvalbeleid("Papierbak", 0);
        System.out.println("Er wordt een doosje leeggegeten");
        return afvalbeleid;
    }
}