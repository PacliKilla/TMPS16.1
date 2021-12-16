package domain.Potions_decorator;

public class Invisibility implements Potions {
    public String preparePotions() {
        return "Invisibility Potion";
    }

    public double potionPrice() {
        return 500.0;
    }
}