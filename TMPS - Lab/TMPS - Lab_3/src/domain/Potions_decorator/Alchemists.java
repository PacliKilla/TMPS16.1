package domain.Potions_decorator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alchemists {
    private static int  choice;
    public static void main(String args[]) throws NumberFormatException, IOException    {
        do{
            System.out.print("1. Invisibility Potion.   \n");
            System.out.print("2. Regenerate Health Potion.\n");
            System.out.print("3. Regenerate Magika Potion.         \n");
            System.out.print("4. Exit                        \n");
            System.out.print("Your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    Invisibility vf=new Invisibility();
                    System.out.println(vf.preparePotions());
                    System.out.println( vf.potionPrice());
                }
                break;

                case 2:{
                    Potions f1=new RegenHealth((Potions) new Invisibility());
                    System.out.println(f1.preparePotions());
                    System.out.println( f1.potionPrice());
                }
                break;
                case 3:{
                    Potions f2=new RegenMagika((Potions) new Invisibility());
                    System.out.println(f2.preparePotions());
                    System.out.println( f2.potionPrice());
                }
                break;

                default:{
                    System.out.println("Other than these no food available");
                }
                return;
            }

        }while(choice!=4);
    }
}
