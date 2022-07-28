package designpatternsabfe.mvcalex.model;

import java.util.ArrayList;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Eigenschappen van een band.
 */
public class Band {
    String bandnaam;
    String genre;
    ArrayList<Bandlid> bandleden;

    public Band(String bandnaam, String genre, ArrayList<Bandlid> bandleden) {
        this.bandnaam = bandnaam;
        this.genre = genre;
        this.bandleden = bandleden;
    }

    @Override
    public String toString() {
        return String.format("bandnaam: %s, genre: %s \nbandleden: %s", this.bandnaam, this.genre, this.bandleden);
    }
    public void printArray() {
        for (Bandlid bandlid : bandleden) {
             bandlid.toString();
        }
    }

}
