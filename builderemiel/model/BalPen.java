package designpatternsabfe.builderemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class BalPen {
    public String kleurPen;
    String inktKleur;

    public BalPen(String kleurPen, String inktKleur) {
        this.kleurPen = kleurPen;
        this.inktKleur = inktKleur;
    }

    @Override
    public String toString() {
        return String.format("kleurPen: %s, inktKleur: %s", this.kleurPen, this.inktKleur);
    }
}
