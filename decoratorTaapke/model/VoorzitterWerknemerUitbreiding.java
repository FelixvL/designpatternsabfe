package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class VoorzitterWerknemerUitbreiding extends WerknemerUitbreiding {
    private boolean maaktAgenda;

    public VoorzitterWerknemerUitbreiding(Werknemer uitgebreideWerknemer, boolean maaktAgenda) {
        super(uitgebreideWerknemer);
        this.maaktAgenda = maaktAgenda;
    }

    @Override
    public void geefTaken() {
        uitgebreideWerknemer.geefTaken();
        voorzittenVergaderingen(uitgebreideWerknemer);
        if (maaktAgenda) {
            agendaMaken(uitgebreideWerknemer);
        }

    }

    private void voorzittenVergaderingen(Werknemer uitgebreideWerknemer) {
        System.out.println("- Zit vergaderingen voor");
    }

    private void agendaMaken(Werknemer uitgebreideWerknemer) {
        System.out.println("- Agenda voor vergaderingen maken");
    }

}
