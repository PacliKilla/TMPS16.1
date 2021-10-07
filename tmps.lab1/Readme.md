# Author: Cerlat Pavel FAF-192


#  Prerequisites:

- Design patterns
- Creational design patterns
- Structure the project using design patterns

## Objectives:

- Study creational design patterns
- Develop a project using 5 creational design patterns
- Ensure connection between patterns

## Tasks:

- Create an application using at least 3 design creational patterns :
   - Builder
   - Abstract Factory
   - Factory
   - Singleton
   - Prototype

##  Implementation of task:
In general this code just creates an Elder Scrolls V Skyrim character which can be a Redguard or a Nord, he has one of the 4 classes which depends on his race and an atronach
which can be of 2 types Flame and Storm.Before starting performing this laboratory work I have studied about design patterns and what is the purpose of usign them into some projects, what are advantages. Also, I have studied each design pattern and I have tried to understand how it works.

## Builder pattern

It is creational design pattern which operate with creating the complex objects and we need to use when the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.


## Singleton helps me create the instance of redguard and nords which means that they are created only once, when requested, and I can access it from anywhere in my program whenever I need

class Redguard implements PlayableRace {
    private static Redguard redguard = null;
    public static Redguard getInstance() throws IOException {
        if (redguard == null) {
            synchronized (Dovahkiin.class) {
                if (redguard == null) {
                    redguard = new Redguard();
                }
            }
        }
        return redguard;
    }
    
 class Nord implements PlayableRace {
    private static Nord nord = null;

    public static Nord getInstance(){
        if (nord == null) {
            synchronized (Dovahkiin.class) {
                if (nord == null) {
                    nord = new Nord();
                }
            }
        }
        return nord;
        
        
Prototype pattern I used for my Atronach class. I have created the Atronach class which has a method that gives it a name and every time I want to add a new Atronach, I just clone the original Atronach and I give him a new name.

public class Atronach {
    private static String name;

    public Atronach(String name) {
        Atronach.name = name;
    }


    public Atronach clone(String name){
        Atronach newAtronach = null;
            newAtronach = new Atronach(name);
        return newAtronach;
    }
}
## Abstract Factory

Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes.
Factory Method and Abstract Factory for example if I want to create a redguard race, I call type race and I am getting the singleton instances of redguards that I have previously created and add them to the corresponding redguard class.

import java.io.IOException;
public final class Races {

    public static PlayableRace add_race(String race) throws IOException {
        switch (race){
            case "redguard": return Redguard.getInstance();
            case "nord": return Nord.getInstance();
            default: return null;
        }
    }
    
class Assassin implements Classes {
    public Assassin() {
        System.out.println("Assassin created");
    }
}
