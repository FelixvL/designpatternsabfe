package designpatternsabfe.factory.anita;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Beschrijving doel code.
 */

public class MuziekBox {

    public Muziek getMuziek (String keuze) {
        if (keuze == null) {
            return null;
        }
        if (keuze.equalsIgnoreCase("ROCK")) {
            return new Rock();
        } else if (keuze.equalsIgnoreCase("KLASSIEK")) {
            return new Klassiek();
        } else if (keuze.equalsIgnoreCase("POP")) {
            return new Pop();
        }
        return null;
    }
}
