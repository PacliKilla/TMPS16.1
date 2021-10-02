import java.io.IOException;

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
    @Override
    public Classes add(String type) {
        switch (type){
            case "Hunter": return new Hunter();
            case "Assassin": return new Assassin();
            default: return null;
        }
    }
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
    }
    @Override
    public Classes add(String type){
        switch (type){
            case "Paladin": return new Paladin();
            case "Battlemage": return new Battlemage();
            default: return null;
        }
    }
}
