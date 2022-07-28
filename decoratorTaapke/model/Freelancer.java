package designpatternsabfe.decoratorTaapke.model;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class Freelancer implements Werknemer{

    
    @Override
    public void voerGewerkteUrenIn() {
        System.out.println("voer uren in van Freelancer");
    }

    @Override
    public void neemVakantieUrenOp() {

    }

    @Override
    public void geefTaken() {
        System.out.println("- Freelance werk");
    }
}
