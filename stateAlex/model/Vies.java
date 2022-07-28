package designpatternsabfe.stateAlex.model;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * {wat doet dit?}
 */
public class Vies implements State{

    @Override
    public void behandelKledingstuk() {
        System.out.println("Voeg het kledingstuk toe aan de wasbeurt om te wassen");
    }
}
