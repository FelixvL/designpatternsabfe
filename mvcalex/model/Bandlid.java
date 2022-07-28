package designpatternsabfe.mvcalex.model;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Eigenschappen van een bandlid.
 */
public class Bandlid {
    String lidnaam;
    String instrument;

    public Bandlid(String lidnaam, String instrument) {
        this.lidnaam = lidnaam;
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return String.format("naam van bandlid: %s, instrument: %s", this.lidnaam, this.instrument);
    }
}
