package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class Flesje implements Versnapering {
    public Afvalbeleid consumeren() {
        Afvalbeleid afvalbeleid = new Afvalbeleid("Flessenautomaat", 0.15);
        System.out.println("Er wordt een flesje leeggedronken");
        return afvalbeleid;
    }
}