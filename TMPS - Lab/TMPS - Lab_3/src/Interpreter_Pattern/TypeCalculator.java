package Interpreter_Pattern;

import client.PowerCalculator;

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