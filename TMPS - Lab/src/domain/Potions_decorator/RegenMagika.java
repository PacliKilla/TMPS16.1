package domain.Potions_decorator;

public class RegenMagika extends Alchemy {
    public RegenMagika(Potions newPotion) {
        super(newPotion);
    }

    public String preparePotions() {
        return super.preparePotions() + " Magika regenerates 50% faster for 300 seconds  ";
    }

    public double potionPrice() {
        return super.potionPrice() + 300.0;
    }

}
