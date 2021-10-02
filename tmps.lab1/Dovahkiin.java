class Dovahkiin {
    private static Dovahkiin dovahkiin;
    private static Atronach[] atronaches;
    private static int i = 0;
    private static Races races;
    public static Dovahkiin getHero() {
        return dovahkiin;
    }
    public static void setHero(Dovahkiin dovahkiin) {
        Dovahkiin.dovahkiin = dovahkiin;
    }
    public static Atronach[] getElementals() {
        return atronaches;
    }
    public static void setElementals(Atronach[] atronaches) {
        Dovahkiin.atronaches = atronaches;
    }
    public static int getI() {
        return i;
    }
    public static void setI(int i) {
        Dovahkiin.i = i;
    }
    public static Races getArmy() {
        return races;
    }
    public static void setRaces(Races races) {
        Dovahkiin.races = races;
    }
    public Dovahkiin() {
    }
    public void add_atronach(Atronach atronach){
        this.atronaches[i] = atronach;
        i++;
    }
}