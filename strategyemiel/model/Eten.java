package designpatternsabfe.strategyemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Eten implements WatDoenZe{
    @Override
    public String ditDoenZe(Hond hond, Kat kat) {
        return hond.naam + " eet " + kat.naam + " op";
    }
}
