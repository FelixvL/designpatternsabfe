package designpatternsabfe.mvcalex.controller;

import designpatternsabfe.mvcalex.model.Band;

import java.util.Scanner;

/**
 * @author Alex Kuiper <al.kuiper@st.hanze.nl>
 * <p>
 * Programma dat bands en bandleden vraagt, en die weergeeft.
 */
public class MvcLauncher {
    public static void main(String[] args) {
        BandController bandController = new BandController();
        bandController.maakBand();
        bandController.printBand();
    }
}
