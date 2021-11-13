package domain.Weapons_facade;

public class Merchant {
    private WeaponShop OneHanded;
    private WeaponShop TwoHanded;
    private WeaponShop Archery;

    public Merchant(){
        OneHanded= new OneHanded();
        TwoHanded=new TwoHanded();
        Archery=new Archery();
    }
    public void OneHandedSale(){
        OneHanded.WeaponType();
        OneHanded.price();
    }
    public void TwoHandedSale(){
        TwoHanded.WeaponType();
        TwoHanded.price();
    }
    public void ArcherySale(){
        Archery.WeaponType();
        Archery.price();
    }
}