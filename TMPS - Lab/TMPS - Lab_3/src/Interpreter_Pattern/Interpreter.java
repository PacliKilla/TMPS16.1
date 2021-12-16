package Interpreter_Pattern;

import client.PowerCalculator;

import java.util.ArrayList;
import java.util.List;

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