package designpatternsabfe.builderemiel.model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Director {


    public Director() {
    }
    public void maakBalPen(Maker maker){
        maker.setKleurPen("Groen");
        maker.setTypePen(TypePen.BALPEN);
        maker.setInktKleur("Blauw");
    }

}
