package designpatternsabfe.strategyemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Krabben implements WatDoenZe{
    @Override
    public String ditDoenZe(Hond hond, Kat kat) {
        return kat.naam + " krabt " + hond.naam;
    }
}
