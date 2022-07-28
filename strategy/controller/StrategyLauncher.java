package designpatternsabfe.strategy.controller;

import designpatternsabfe.strategy.model.Huisje;
import designpatternsabfe.strategy.model.Schoonmaak;
import designpatternsabfe.strategy.model.Seizoen;
import designpatternsabfe.strategy.model.Situatie;

/**
 * @author Taapke Bergsma <t.bergsma@st.hanze.nl>
 */

public class StrategyLauncher {
    public static void main(String[] args) {
        System.out.println("Dit programma is geschreven door Taapke");

        Seizoen hoogseizoen = new Seizoen("hoogseizoen", 1.5);
        Huisje goedkoopHuisje = new Huisje(2000, 20, 40);
        Situatie situatie = new Situatie(new Schoonmaak());
        double prijsSchoonmaakGoedkoopHuisje = situatie.voerHandelingUit(hoogseizoen, goedkoopHuisje);

        System.out.printf("De prijs om dit huis schoon te maken in het %s is %.2f",
                hoogseizoen.getNaam(), prijsSchoonmaakGoedkoopHuisje);

    }
}
