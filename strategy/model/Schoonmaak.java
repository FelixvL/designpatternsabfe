package designpatternsabfe.strategy.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Schoonmaak implements Handeling{


    @Override
    public double geefPrijsBehandelingHuis(Seizoen seizoen, Huisje huisje) {
        return seizoen.getPrijsFactor() * huisje.getSchoonmaakKosten();
    }
}
