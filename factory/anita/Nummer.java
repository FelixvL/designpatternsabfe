package designpatternsabfe.factory.anita;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Nummer implements Muziek {

    @Override
    public Nummer speelAf() {
        return null;
    }

    public Nummer rock() {
        System.out.println("Rock: Sweet Child O' Mine - Guns 'N Roses");
        return null;
    }

    public Nummer klassiek() {
        System.out.println("Klassiek: Time - Hans Zimmer");
        return null;
    }

    public Nummer pop() {
        System.out.println("Pop: About Damn Time - Lizzo");
        return null;
    }

}
