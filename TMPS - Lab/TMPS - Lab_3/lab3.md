#Behavioral Design Patterns
###Author: Cerlat Pavel

## Short Theory

For this laboratory work, I have researched the following Behavioral Design Patterns:

   * Chain of Responsibility
   * Command
   * Interpreter
   * Iterator
   * Mediator
   * Observer
   * Strategy

After analyzing each of them I decided to implement Interpreter in my project, because I thought that it will best suit the workflow of my lab. 

## Argument

I used Interpreter pattern for carrying out fights and deciding who won the fight.

## Implementation 

There is a rule for calculation of power according to:
Atronach

    public class ElementalCalculator implements PowerCalculator {

    private List<String> Atronach;

    public ElementalCalculator(List<String> elementals){
        this.Atronach = elementals;
    }

    @Override
    public int calculate() {
        int power = 0;
        for(String element : Atronach){
            if(element.equals("earth")){
                power += 6;
            }
            else if(element.equals("water")){
                power += 8;
            }
            else if(element.equals("fire")){
                power += 10;
            }
            else if(element.equals("aer")){
                power += 4;
            }
        }
        return power;
    }
}

and class.

   public class TypeCalculator implements PowerCalculator {

    private String type;

    public TypeCalculator(String type){
        this.type = type;
    }

    @Override
    public int calculate() {

        if (type.equals("assasin")){
            return 25;
        }
        else if (type.equals("battlemage")){
            return 30;
        }
        else if (type.equals("hunter")){
            return 20;
        }
        else if (type.equals("paladin")){
            return 15;
        }
        else return 0;
    }
}

Then the terminal calculation, the calculation of full Dovahkiin power, goes according to a formula.

    public class TerminalCalculator implements PowerCalculator {
    
        private PowerCalculator elementalPower;
        private PowerCalculator typePower;
    
        public TerminalCalculator(PowerCalculator elementalPower, PowerCalculator typePower) {
            this.elementalPower = elementalPower;
            this.typePower = typePower;
        }
    
        @Override
        public int calculate() {
            return 5 * elementalPower.calculate() + typePower.calculate();
        }
    }    
    
The interpreter, which receive the information about hero and his opponent, calculates power of each hero and then returns will the hero win or lose.

   public class Interpreter {
    private static List<String> heroAtronach = new ArrayList<>();
    private static List<String> compareHeroAtronach = new ArrayList<>();
    private static String DovahkiinType;
    private static String compareDovahkiinType;

    public Interpreter(Dovahkiin hero, Hero compare_to) {
        this.DovahkiinType = hero.getRace().getTypeRace().getType();
        this.compareHeroType = compare_to.getRace().getTypeRace().getType();
        for(Atronach elemental : Dovahkiin.getAtronach()){
            heroElementals.add(elemental.getName());
        }
        for(Atronach elemental : compare_to.getAtronach()){
            compareDovahkiinAtronach.add(elemental.getName());
        }
    }

    private static PowerCalculator getDovahkiinPower(){
        PowerCalculator DovahkiinElementalPower = new ElementalCalculator(heroAtronach);
        PowerCalculator DovahkiinTypePower = new TypeCalculator(DovahkiinType);
        return new TerminalCalculator(DovahkiinElementalPower,DovahkiinTypePower);
    }

    private static PowerCalculator getCompareDovahkiinPower(){
        PowerCalculator compareDovahkiinElementalPower = new ElementalCalculator(compareHeroAtronach);
        PowerCalculator compareDovahkiinTypePower = new TypeCalculator(compareDovahkiinType);
        return new TerminalCalculator(compareDovahkiinElementalPower,compareDovahkiinTypePower);
    }

    public static boolean will_win() {
        PowerCalculator DovahkiinPower = getDovahkiinPower();
        PowerCalculator compareDovahkiinPower = getCompareDovahkiinPower();

        System.out.println("Dovahkiin power: " + DovahkiinPower.calculate());
        System.out.println("Dovahkiin hero power: " + compareDovahkiinPower.calculate());
        if(DovahkiinPower.calculate() >= compareDovahkiinPower.calculate())
            return true;
        else
            return false;
    }
}


