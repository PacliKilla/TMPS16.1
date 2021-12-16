package domain.Potions_decorator;


public class RegenHealth extends Alchemy {
    public RegenHealth(Potions newPotion) {
        super(newPotion);
    }

    public String preparePotions() {
        return super.preparePotions() + " Health regenerates 50% faster for 300 seconds  ";
    }

    public double potionPrice() {
        return super.potionPrice() + 150.0;
    }

}