package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class TeamleiderWerknemerUitbreiding extends WerknemerUitbreiding {
    public TeamleiderWerknemerUitbreiding(Werknemer uitgebreideWerknemer) {
        super(uitgebreideWerknemer);
    }

    @Override
    public void geefTaken() {
        uitgebreideWerknemer.geefTaken();
        planVergaderingen(uitgebreideWerknemer);

    }

    private void planVergaderingen(Werknemer uitgebreideWerknemer) {
        System.out.println("- Vergaderingen inplannen");
    }
}
