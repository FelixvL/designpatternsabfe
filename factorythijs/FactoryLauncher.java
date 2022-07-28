package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class FactoryLauncher {
    public static void main(String[] args) {
        System.out.println("van Thijs");
        Automaat automaat = new Automaat();

        Versnapering versnapering1 = automaat.krijgVersnapering("BLIKJE");
        System.out.println(versnapering1.consumeren().getManier());
        Versnapering versnapering2 = automaat.krijgVersnapering("Flesje");
        Afvalbeleid a = versnapering2.consumeren();
        System.out.println(a.getManier());
        System.out.println(a.getStatiegeld());
        Versnapering versnapering3 = automaat.krijgVersnapering("Doosje");
        versnapering3.consumeren();
    }
}
