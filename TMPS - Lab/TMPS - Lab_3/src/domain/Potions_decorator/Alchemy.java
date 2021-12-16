package domain.Potions_decorator;

public abstract class Alchemy implements Potions{
    private Potions newPotion;
    public Alchemy(Potions newPotion)  {
        this.newPotion=newPotion;
    }
    @Override
    public String preparePotions(){
        return newPotion.preparePotions();
    }
    public double potionPrice(){
        return newPotion.potionPrice();
    }
}

