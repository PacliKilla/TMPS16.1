package domain.Weapons_facade;

public class OneHanded implements WeaponShop {
    @Override
    public void WeaponType() {
        System.out.println(" Ancient Nord Sword ");
    }
    @Override
    public void price() {
        System.out.println(" 13.00 Septim ");
    }
}