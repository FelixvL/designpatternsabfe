package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class Blikje implements Versnapering {
    public Afvalbeleid consumeren() {
        Afvalbeleid afvalbeleid = new Afvalbeleid("Prullenbak", 0);
        System.out.println("Er wordt een blikje leeggedronken");
        return afvalbeleid;
    }
}