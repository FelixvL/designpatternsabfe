package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Bewaker implements Werknemer {
    private String naam;

    public Bewaker(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public void geefTaken() {
        System.out.println("- Houd camera's in de gaten");
    }
}
