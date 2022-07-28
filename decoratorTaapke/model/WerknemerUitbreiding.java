package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class WerknemerUitbreiding implements Werknemer{
    protected Werknemer uitgebreideWerknemer;

    public WerknemerUitbreiding(Werknemer uitgebreideWerknemer) {
        this.uitgebreideWerknemer = uitgebreideWerknemer;
    }

    @Override
    public void voerGewerkteUrenIn() {

    }

    @Override
    public void neemVakantieUrenOp() {
        System.out.println("Neem vakantie-uren op.");
    }

    @Override
    public void geefTaken() {
        uitgebreideWerknemer.geefTaken();
    }
}
