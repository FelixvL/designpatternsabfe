package designpatternsabfe.strategy.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Seizoen {
    private String naam;
    double prijsFactor;

    public Seizoen(String naam, double prijsFactor) {
        this.naam = naam;
        this.prijsFactor = prijsFactor;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijsFactor() {
        return prijsFactor;
    }
}
