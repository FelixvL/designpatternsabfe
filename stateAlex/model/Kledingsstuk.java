package designpatternsabfe.stateAlex.model;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * {wat doet dit?}
 */
public class Kledingsstuk {
    private State state;

    public Kledingsstuk() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
