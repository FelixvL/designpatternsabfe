package designpatternsabfe.stateAlex.model;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Staat van het kledingstuk.
 */
public class Gescheurd implements State {
    @Override
    public void behandelKledingstuk() {
        System.out.println("Stop het kledingstuk in de afvalzak om weg te gooien");
    }
}
