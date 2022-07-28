package designpatternsabfe.mvcalex.controller;

import designpatternsabfe.mvcalex.model.Band;
import designpatternsabfe.mvcalex.model.Bandlid;
import designpatternsabfe.mvcalex.view.BandView;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Verzorgt interacties met de band.
 */
public class BandController {
        Scanner keyboard = new Scanner(System.in);

    public Band maakBand() {
        System.out.print("Voer je bandnaam in: ");
        String bandnaam = keyboard.nextLine();
        System.out.print("Voer het genre van je band in: ");
        String genre = keyboard.nextLine();

        ArrayList<Bandlid> bandleden = new ArrayList<>();
        bandleden.add(maakBandlid());
//        System.out.print("Druk op 1 in om nog een bandlid toe te voegen: ");
//        int keuze = keyboard.nextInt();
//        while (keuze == 1) {
//            bandleden.add(maakBandlid());
//            System.out.print("Druk op 1 in om nog een bandlid toe te voegen: ");
//            keuze = keyboard.nextInt();
//            System.out.println();
//        }

        Band mijnband = new Band(bandnaam, genre, bandleden);
        return mijnband;
    }

    private Bandlid maakBandlid() {
        System.out.print("Voer de naam van een bandlid in: ");
        String bandlidNaam = keyboard.nextLine();
        System.out.print("Voer het instrument in: ");
        String instrument = keyboard.nextLine();
        Bandlid bandlid = new Bandlid(bandlidNaam, instrument);
        return bandlid;
    }

    public void printBand() {
        BandView bandView = new BandView();
        bandView.geefBandWeer(maakBand());

    }

}
