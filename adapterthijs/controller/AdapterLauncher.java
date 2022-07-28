package designpatternsabfe.adapterthijs.controller;

import designpatternsabfe.adapterthijs.model.KrantenPrinter;
import designpatternsabfe.adapterthijs.model.PrinterAdapter;
import designpatternsabfe.adapterthijs.model.StandaardPrinter;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class AdapterLauncher {
    public static void main(String[] args) {
        KrantenPrinter krantenPrinter = new KrantenPrinter();

        krantenPrinter.drukAf("krant", "de Volkskrant");
        krantenPrinter.drukAf("tijdschrift", "Vrij Nederland");
        krantenPrinter.drukAf("boek", "De ontdekking van de hemel");
        krantenPrinter.drukAf("film", "The Godfather");
    }
}
