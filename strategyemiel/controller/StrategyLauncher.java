package designpatternsabfe.strategyemiel.controller;

import designpatternsabfe.strategyemiel.model.*;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class StrategyLauncher {
    public static void main(String[] args) {
        System.out.println("van Emiel");
        Context context = new Context(new Eten());
        System.out.println(context.executeWatDoenZe(new Hond("Hondje"), new Kat("Katje")));

        context = new Context(new Spelen());
        System.out.println(context.executeWatDoenZe(new Hond("Hondje"), new Kat("Katje")));
        context = new Context(new Krabben());
        System.out.println(context.executeWatDoenZe(new Hond("Hondje"), new Kat("Katje")));
    }
}
