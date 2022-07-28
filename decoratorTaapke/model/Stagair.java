package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Stagair implements Werknemer{
    private String naam;
    private double Stagevergoeding = 1000;

    public Stagair(String naam, double stagevergoeding) {
        this.naam = naam;
        Stagevergoeding = stagevergoeding;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public void geefTaken() {
        System.out.println("- Werken aan stageverslag");
    }

}
