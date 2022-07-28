package designpatternsabfe.adapterthijs.model;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class PrinterAdapter implements StandaardPrinter {

        GeavanceerdePrinter geavanceerdePrinter;

        public PrinterAdapter(String soortMedium){
            if(soortMedium.equalsIgnoreCase("boek") ){
                geavanceerdePrinter = new BoekenPrinter();
            }else if (soortMedium.equalsIgnoreCase("tijdschrift")){
                geavanceerdePrinter = new TijdschriftPrinter();
            }
        }

        @Override
        public void drukAf(String soortMedium, String titel) {

            if(soortMedium.equalsIgnoreCase("boek")){
                geavanceerdePrinter.drukBoek(titel);
            }
            else if(soortMedium.equalsIgnoreCase("tijdschrift")){
                geavanceerdePrinter.drukTijdschrift(titel);
            }
        }
}