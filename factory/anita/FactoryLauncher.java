package designpatternsabfe.factory.anita;

import java.util.Scanner;

/**
 * @Auteur Anita Bos <at.bos@st.hanze.nl>
 * <p>
 * Factory Design Pattern die een jukebox simuleert.
 */

public class FactoryLauncher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MuziekBox muziekBox = new MuziekBox();

        Muziek gekozenNummer = null;
        int keuze = 5;
        while (keuze > 3 || keuze < 1) {
            System.out.println("Naar welk genre wil je luisteren?");
            System.out.println("1) Rock");
            System.out.println("2) Klassiek");
            System.out.println("3) Pop");
            keuze = keyboard.nextInt();
            switch (keuze) {
                case 1:
                    gekozenNummer = new Rock();
                    break;
                case 2:
                    gekozenNummer = new Klassiek();
                    break;
                case 3:
                    gekozenNummer = new Pop();
                    break;
                default:
                    System.out.println("ongeldige keuze, probeer het opnieuw.");
            }
        }

        Muziek keuzeRock = muziekBox.getMuziek("ROCK");
        keuzeRock.speelAf();

        Muziek keuzeKlassiek = muziekBox.getMuziek("KLASSIEK");
        keuzeKlassiek.speelAf();

        Muziek keuzePop = muziekBox.getMuziek("POP");
        keuzePop.speelAf();
    }
}
