package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Freelancer implements Werknemer{
    protected String naam;

    public Freelancer(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public void geefTaken() {
        System.out.println("- Freelance werk");
    }
}
