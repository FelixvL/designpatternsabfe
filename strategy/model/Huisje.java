package designpatternsabfe.strategy.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Huisje {
    double koopPrijs;
    double huurPrijsPerNacht;
    double schoonmaakKosten;

    public Huisje(double koopPrijs, double huurPrijsPerNacht, double schoonmaakKosten) {
        this.koopPrijs = koopPrijs;
        this.huurPrijsPerNacht = huurPrijsPerNacht;
        this.schoonmaakKosten = schoonmaakKosten;
    }

    public double getKoopPrijs() {
        return koopPrijs;
    }

    public double getHuurPrijsPerNacht() {
        return huurPrijsPerNacht;
    }

    public double getSchoonmaakKosten() {
        return schoonmaakKosten;
    }
}
