package designpatternsabfe.adapterthijs.model;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class KrantenPrinter implements StandaardPrinter {
        PrinterAdapter printerAdapter;

        @Override
        public void drukAf(String soortMedium, String titel) {
            if(soortMedium.equalsIgnoreCase("krant")){
                System.out.println("De volgende krant wordt gedrukt: " + titel);
            }

            else if(soortMedium.equalsIgnoreCase("tijdschrift") || soortMedium.equalsIgnoreCase("boek")){
                printerAdapter = new PrinterAdapter(soortMedium);
                printerAdapter.drukAf(soortMedium, titel);
            }
            else{
                System.out.println("Het type " + soortMedium + " kan helaas niet worden afgedrukt");
            }
        }
    }