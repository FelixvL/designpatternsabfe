package designpatternsabfe.strategyemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Context {
    private WatDoenZe watDoenZe;

    public Context(WatDoenZe watDoenZe){
        this.watDoenZe = watDoenZe;
    }

    public String executeWatDoenZe(Hond hond, Kat kat){
        return watDoenZe.ditDoenZe(hond, kat);
    }
}