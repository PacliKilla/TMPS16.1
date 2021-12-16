package domain;

import client.PlayableRace;

import java.io.IOException;
public final class Races {

    public static PlayableRace add_race(String race) throws IOException {
        switch (race){
            case "redguard": return Redguard.getInstance();
            case "nord": return Nord.getInstance();
            default: return null;
        }
    }
}