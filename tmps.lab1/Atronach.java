

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
