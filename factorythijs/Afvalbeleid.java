package designpatternsabfe.factorythijs;

/**
 * @author Thijs Hettinga
 * <p>
 * Uitleg wat het doet
 */

public class Afvalbeleid {
private String manier;
private double statiegeld;

    public Afvalbeleid(String manier, double statiegeld) {
        this.manier = manier;
        this.statiegeld = statiegeld;
    }

    public String getManier() {
        return manier;
    }

    public double getStatiegeld() {
        return statiegeld;
    }
}
