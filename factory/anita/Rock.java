package designpatternsabfe.factory.anita;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class Rock implements Muziek {

    @Override
    public Nummer speelAf() {
        Nummer nummer = new Nummer();
        nummer.rock();
        return nummer;
    }

}
