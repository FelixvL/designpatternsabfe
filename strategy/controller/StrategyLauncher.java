package designpatternsabfe.strategy.controller;

import designpatternsabfe.strategy.model.*;

import java.util.ArrayList;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class StrategyLauncher {
    public static void main(String[] args) {
        System.out.println("Dit programma is geschreven door Taapke");

        // Huisjes
        Huisje goedkoopHuisje = new Huisje(2000, 20, 40);
        Huisje normaalHuisje = new Huisje(4000, 45, 60);
        Huisje duurHuisje = new Huisje(10000, 150, 100);

        ArrayList<Huisje> huisjes = new ArrayList<>();
        huisjes.add(goedkoopHuisje);
        huisjes.add(normaalHuisje);
        huisjes.add(duurHuisje);

        // Seizoenen
        Seizoen hoogseizoen = new Seizoen("hoogseizoen", 1.5);
        Seizoen laagseizoen = new Seizoen("laagseizoen", 0.5);

        // -- Schoonmaken in hoogseizoen
        Situatie situatie = new Situatie(new Schoonmaak());
        for (Huisje huisje : huisjes) {
            double schoonmaakPrijs = situatie.voerHandelingUit(hoogseizoen, huisje);
            System.out.printf("De prijs om dit huis schoon te maken in het %s is %.2f\n",
                    hoogseizoen.getNaam(), schoonmaakPrijs);
        }
        System.out.println();

        // -- Verkopen in hoogseizoen
        situatie = new Situatie(new Verkoop());
        for (Huisje huisje : huisjes) {
            double verkoopPrijs = situatie.voerHandelingUit(hoogseizoen, huisje);
            System.out.printf("De prijs om dit huis te verkopen in het %s is %.2f\n",
                    hoogseizoen.getNaam(), verkoopPrijs);
        }
        System.out.println();

        // -- Verhuren in laagseizoen
        situatie = new Situatie(new Verhuur());
        for (Huisje huisje : huisjes) {
            double verkoopPrijs = situatie.voerHandelingUit(laagseizoen, huisje);
            System.out.printf("De prijs om dit huis te verhuren in het %s is %.2f\n",
                    hoogseizoen.getNaam(), verkoopPrijs);
        }
    }
}
