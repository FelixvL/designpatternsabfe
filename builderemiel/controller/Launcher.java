package designpatternsabfe.builderemiel.controller;

import designpatternsabfe.builderemiel.model.BalPen;
import designpatternsabfe.builderemiel.model.Director;
import designpatternsabfe.builderemiel.model.Maker;
import designpatternsabfe.builderemiel.model.PennenMaker;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Launcher {
    public static void main(String[] args) {
        Director director = new Director();
        PennenMaker pennenMaker = new PennenMaker();

        director.maakBalPen(pennenMaker);
        BalPen balPen = pennenMaker.getResult();
        balPen
        System.out.println(balPen.toString());

    }

}
