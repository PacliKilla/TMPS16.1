import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Dovahkiin dovahkiin = new Dovahkiin();
        Dovahkiin dovahkiin1 = new Dovahkiin();
        Atronach atronach1 = new Atronach("flame");
        Atronach atronach2 = atronach1.clone("storm");
        dovahkiin.add_atronach(atronach1);
        dovahkiin.add_atronach(atronach2);
        Races races = new Races();
        races.add_race("redguard").add("hunter");
        dovahkiin.setRaces(races);
    }
}
