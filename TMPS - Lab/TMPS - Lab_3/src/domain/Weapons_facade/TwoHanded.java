package domain.Weapons_facade;

public class TwoHanded implements WeaponShop {
    @Override
    public void WeaponType() {
        System.out.println(" Ancient Nord Greatsword ");
    }
    @Override
    public void price() {
        System.out.println("  35.00 Septim ");
    }
}