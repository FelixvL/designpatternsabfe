package designpatternsabfe.factory.anita;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Klassiek implements Muziek{
    @Override
    public Nummer speelAf() {
        Nummer nummer = new Nummer();
        nummer.klassiek();
        return nummer;
    }
}
