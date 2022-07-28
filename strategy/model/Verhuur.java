package designpatternsabfe.strategy.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Verhuur implements Handeling{

    @Override
    public double geefPrijsBehandelingHuis(Seizoen seizoen, Huisje huisje) {
        return 0;
    }
}
