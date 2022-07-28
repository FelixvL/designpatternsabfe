package designpatternsabfe.strategyemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Spelen  implements WatDoenZe{
    @Override
    public String ditDoenZe(Hond hond, Kat kat) {
        return hond.naam + " speelt met " + kat.naam;
    }
}
