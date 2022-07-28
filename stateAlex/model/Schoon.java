package designpatternsabfe.stateAlex.model;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Staat van het kledingstuk.
 */
public class Schoon implements State {
    @Override
    public void behandelKledingstuk() {
        System.out.println("Hang het kledingstuk in de kast om later aan te kunnen trekken");
        Kast kledingkast = new Kast();
    }
}
