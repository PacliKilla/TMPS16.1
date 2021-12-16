package domain.Weapons_facade;

public class Archery  implements WeaponShop {
    @Override
    public void WeaponType() {
        System.out.println(" Ancient Nord Bow ");
    }
    @Override
    public void price() {
        System.out.println("  45.00 Septim ");
    }
}