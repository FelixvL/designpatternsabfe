package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class VoorzitterWerknemerUitbreiding extends WerknemerUitbreiding {
    public VoorzitterWerknemerUitbreiding(Werknemer uitgebreideWerknemer) {
        super(uitgebreideWerknemer);
    }

    @Override
    public void geefTaken() {
        uitgebreideWerknemer.geefTaken();
        voorzittenVergaderingen(uitgebreideWerknemer);
    }

    private void voorzittenVergaderingen(Werknemer uitgebreideWerknemer) {
        System.out.println("- Zit vergaderingen voor.");
    }
}
