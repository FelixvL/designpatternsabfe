package designpatternsabfe.factory.anita;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Pop implements Muziek{
    @Override
    public Nummer speelAf() {
        Nummer nummer = new Nummer();
        nummer.pop();
        return nummer;
    }
}
