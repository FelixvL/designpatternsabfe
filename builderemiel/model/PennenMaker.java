package designpatternsabfe.builderemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class PennenMaker implements Maker {
    TypePen typePen;
    String kleurPen;
    String inktKleur;

    @Override
    public void setTypePen(TypePen typePen) {
        this.typePen = typePen;
    }

    @Override
    public void setKleurPen(String kleur) {
        this.kleurPen = kleur;
    }

    @Override
    public void setInktKleur(String kleur) {
        this.inktKleur = kleur;
    }

    public BalPen getResult(){
        return new BalPen("Groen", "Blauw");
    }
}
