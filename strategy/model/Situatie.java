package designpatternsabfe.strategy.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Situatie {
    private Handeling handeling;

    public Situatie(Handeling handeling) {
        this.handeling = handeling;
    }

    public double voerHandelingUit(Seizoen seizoen, Huisje huisje) {
        return handeling.geefPrijsBehandelingHuis(seizoen, huisje);
    }
}
