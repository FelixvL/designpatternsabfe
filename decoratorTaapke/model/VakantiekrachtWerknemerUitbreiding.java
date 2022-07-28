package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class VakantiekrachtWerknemerUitbreiding extends WerknemerUitbreiding{
    String contractType;

    public VakantiekrachtWerknemerUitbreiding(Werknemer uitgebreideWerknemer) {
        super(uitgebreideWerknemer);
        this.contractType = "tijdelijk";
    }
}
